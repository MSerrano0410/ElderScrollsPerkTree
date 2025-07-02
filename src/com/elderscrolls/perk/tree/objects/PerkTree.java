package com.elderscrolls.perk.tree.objects;

import com.elderscrolls.perk.tree.utils.PerkUtils;

/**
 * Binary tree class housing Skyrim-like perks and perk trees
 * Note that "side branching perks" are to the left of a root perk, right is the "main branch" in the skill tree.
 */
public class PerkTree {
	Perk rootPerk;
	String skillName;
	boolean isAtInitialPerk;
	
	public PerkTree(String skillName) {
		rootPerk = null;
		this.setSkillName(skillName);
		this.setIsAtInitialPerk(true);
	}
	
	/**
	 * Public function to insert a new Perk to a tree
	 * @param isSidePerk - whether it's a branching or main perk
	 * @param name - name of new perk
	 * @param description - perk's description
	 */
	public void insert(boolean isSidePerk, String name, String description) {
		rootPerk = insertPerk(rootPerk, isSidePerk, name, description);
	}
	
	/**
	 * Either inserts a root node (if the tree is null/empty) or inserts a child node
	 * @param rootPerk - perk (node) to work with. Can be left or right if it isn't a root node/perk
	 * @param isSidePerk - if the perk is a branching or main trunk perk
	 * @param name - name of the new Perk to insert (if not root)
	 * @param description - Description of non-root node to insert
	 * @return new Perk added
	 */
	private Perk insertPerk(Perk rootPerk, boolean isSidePerk, String name, String description) {
		
		//special case for initial perks
		if (this.getIsAtInitialPerk()) {
			rootPerk = PerkConstants.initialPerks.getInitialPerk(this.skillName);
			this.setIsAtInitialPerk(false);
			return rootPerk;
		} else if (rootPerk == null) {
			rootPerk = new Perk (isSidePerk, name, description);
			return rootPerk;
		}
		
		if (rootPerk.isSideBranchingPerk()) {
			rootPerk.leftPerk = insertPerk(rootPerk.leftPerk, true, name, description);
		} else {
			rootPerk.rightPerk = insertPerk(rootPerk.rightPerk, false, name, description);
		}
		
		return rootPerk;
	}
	
	/**
	 * Public function to traverse the skill tree
	 */
	public void inorder() {
		inorderPerks(rootPerk);
	}
	
	/**
	 * Prints out perks in order based on the binary tree's order
	 * @param rootPerk - perk to start from
	 */
	private void inorderPerks(Perk rootPerk) {
		if (rootPerk != null) {
			inorderPerks(rootPerk.leftPerk);
			System.out.println(PerkUtils.getPerkInformation(rootPerk));
			inorderPerks(rootPerk.rightPerk);
		}
	}
	
	/**
	 * Public function to search for a perk by name
	 * @param perkName - name of perk to search for
	 * @return - Perk object if perk found, null otherwise
	 */
	public Perk search(String perkName) {
		return searchPerk(rootPerk, perkName);
	}
	
	/**
	 * Searches for a perk by traversing the tree
	 * @param rootPerk
	 * @param perkName
	 * @return - Perk if found, null otherwise
	 */
	private Perk searchPerk(Perk rootPerk, String perkName) {
		if (rootPerk == null) {
			return null;
		}
		
		if (rootPerk.getPerkName().equals(perkName)) {
			return rootPerk;
		}
		
		if (rootPerk.isSideBranchingPerk()) {
			return searchPerk(rootPerk.leftPerk, perkName);
		} else {
			return searchPerk(rootPerk.rightPerk, perkName);
		}
	}
	
	//getters/setters
	public void setSkillName(String skillName) {
		this.skillName = skillName;
	}
	
	public void setIsAtInitialPerk(boolean isAtInitialPerk) {
		this.isAtInitialPerk = isAtInitialPerk;
	}
	
	public String getSkillName() {
		return this.skillName;
	}
	
	public boolean getIsAtInitialPerk() {
		return this.isAtInitialPerk;
	}
	
	public Perk getRootPerk() {
		return this.rootPerk;
	}
}

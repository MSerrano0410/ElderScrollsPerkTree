package com.elderscrolls.perk.tree.main;

import com.elderscrolls.perk.tree.objects.Perk;
import com.elderscrolls.perk.tree.objects.PerkConstants;
import com.elderscrolls.perk.tree.objects.PerkTree;
import com.elderscrolls.perk.tree.utils.PerkUtils;

public class PerkTreeMain {

	public static void main(String[] args) {
		PerkTree alterationTree = new PerkTree(PerkConstants.ALTERATION_SKILL_NAME);
		
		//insert nodes
		alterationTree.insert(false, "Novice Alteration", "Initial perk");
		alterationTree.insert(true, "Alteration Dual Casting", "Dual casting an Alteration strengthens it.");
		alterationTree.insert(false, "Apprentice Alteration", "Cast Apprentice Alteration spells for half magicka.");
		alterationTree.insert(true, "Mage Armor", "Protection spells are twice as strong if not wearing armor.");
		alterationTree.insert(false, "Adept Alteration", "Cast Adept Alteration spells for half magicka.");
		alterationTree.insert(false, "Expert Alteration", "Cast Expert Alteration spells for half magicka.");
		alterationTree.insert(true, "Atronach", "Absorb 10% of a spell's effects.");
		alterationTree.insert(false, "Master Alteration", "Cast Master Alteration spells for half magicka.");
		
		//print out traversal of tree
		System.out.println("Perk tree traversal for " + alterationTree.getSkillName() + ":");
		alterationTree.inorder();
		
		//search for a perk
		String perkName = "Atronach";
		Perk searchPerk = alterationTree.search(perkName);
		if (searchPerk != null) {
			System.out.println("Perk Information -- " + PerkUtils.getPerkInformation(searchPerk) + ".");
		} else {
			System.out.println("Perk " + perkName + " not found in the " + alterationTree.getSkillName() + " skill tree!");
		}
	}

}

package com.elderscrolls.perk.tree.objects;

/**
 * Class used to define a perk. 
 * @param perkName - name of the perk. Also used as the key for searches
 */
public class Perk {
	private boolean sideBranchingPerk; 
	private String perkName;
	public Perk leftPerk;
	public Perk rightPerk;
	private String tooltip;
	
	public Perk (boolean sideBranchingPerk, String perkName, String tooltip) {
		this.sideBranchingPerk = sideBranchingPerk;
		this.perkName = perkName;
		this.tooltip = tooltip;
		this.leftPerk = this.rightPerk = null;
	}
	
	public boolean isSideBranchingPerk() {
		return this.sideBranchingPerk;
	}
	
	public String getPerkName() {
		return this.perkName;
	}
	
	public Perk getLeftPerk() {
		return this.leftPerk;
	}
	
	public Perk getRightPerk() {
		return this.rightPerk;
	}
	
	public String getTooltip() {
		return this.tooltip;
	}
	
	public void setSideBranchingPerk(boolean sideBranchingPerk) {
		this.sideBranchingPerk = sideBranchingPerk;
	}
	
	public void setPerkName(String perkName) {
		this.perkName = perkName;
	}
	
	public void setLeftPerk(Perk leftPerk) {
		this.leftPerk = leftPerk;
	}
	
	public void setRightPerk(Perk rightPerk) {
		this.rightPerk = rightPerk;
	}
	
	public void setTooltip(String tooltip) {
		this.tooltip = tooltip;
	}
}

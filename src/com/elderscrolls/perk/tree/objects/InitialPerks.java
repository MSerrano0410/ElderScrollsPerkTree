package com.elderscrolls.perk.tree.objects;

import java.util.HashMap;

import com.elderscrolls.perk.tree.utils.PerkUtils;

/**
 * Sets up initial perk HashMap with searching capabilities
 * TODO: Log in log4j.
 */
public class InitialPerks {
	private HashMap<String, Perk> initialPerks;
	
	public InitialPerks() {
		if (initialPerks == null || initialPerks.isEmpty()) {
			initialPerks = new HashMap<String, Perk>();
		}
		
		initialPerks.put(PerkConstants.ALTERATION_SKILL_NAME, PerkConstants.ALTERATION_INITIAL_PERK);
		initialPerks.put(PerkConstants.RESTORATION_SKILL_NAME, PerkConstants.RESTORATION_INITIAL_PERK);
		initialPerks.put(PerkConstants.ILLUSION_SKILL_NAME, PerkConstants.ILLUSION_INITIAL_PERK);
		initialPerks.put(PerkConstants.DESTRUCTION_SKILL_NAME, PerkConstants.DESTRUCTION_INITIAL_PERK);
		initialPerks.put(PerkConstants.CONJURATION_SKILL_NAME, PerkConstants.CONJURATION_INITIAL_PERK);
		initialPerks.put(PerkConstants.ALCHEMY_SKILL_NAME, PerkConstants.ALCHEMY_INITIAL_PERK);
		initialPerks.put(PerkConstants.ENCHANTING_SKILL_NAME, PerkConstants.ENCHANTING_INITIAL_PERK);
		initialPerks.put(PerkConstants.ONE_HANDED_SKILL_NAME, PerkConstants.ONE_HANDED_INITIAL_PERK);
		initialPerks.put(PerkConstants.TWO_HANDED_SKILL_NAME, PerkConstants.TWO_HANDED_INITIAL_PERK);
		initialPerks.put(PerkConstants.HEAVY_ARMOR_SKILL_NAME, PerkConstants.HEAVY_ARMOR_INITIAL_PERK);
		initialPerks.put(PerkConstants.LIGHT_ARMOR_SKILL_NAME, PerkConstants.LIGHT_ARMOR_INITIAL_PERK);
		initialPerks.put(PerkConstants.SNEAK_SKILL_NAME, PerkConstants.SNEAK_INITIAL_PERK);
		initialPerks.put(PerkConstants.ARCHERY_SKILL_NAME, PerkConstants.ARCHERY_INITIAL_PERK);
		initialPerks.put(PerkConstants.PICKPOCKET_SKILL_NAME, PerkConstants.PICKPOCKET_INITIAL_PERK);
		initialPerks.put(PerkConstants.SPEECH_SKILL_NAME, PerkConstants.SPEECH_INITIAL_PERK);
		initialPerks.put(PerkConstants.BLOCK_SKILL_NAME, PerkConstants.BLOCK_INITIAL_PERK);
		initialPerks.put(PerkConstants.SMITHING_SKILL_NAME, PerkConstants.SMITHING_INITIAL_PERK);
		initialPerks.put(PerkConstants.LOCKPICKING_SKILL_NAME, PerkConstants.LOCKPICKING_INITIAL_PERK);
	}
	
	/**
	 * Adds new perk to initialPerk list if doesn't exist; useful for additions to game
	 * @param perkName - key for new perk
	 * @param newPerk - new perk to add
	 */
	public void addInitialPerk(String perkName, Perk newPerk) {
		if (!initialPerks.containsKey(perkName)) {
			initialPerks.put(perkName, newPerk);
		}
	}
	
	/**
	 * Removes perk from HashMap
	 * @param perkName - key
	 */
	public void removeInitialPerk(String perkName) {
		initialPerks.remove(perkName);
	}
	
	/**
	 * Gets the initial perk with the given perkName
	 * TODO: Have custom Exception to log an error using log4j and return an empty perk
	 * @param perkName
	 * @return
	 */
	public Perk getInitialPerk(String perkName) {
		if (!PerkUtils.perkExistsInHash(perkName, initialPerks)) {
			return null; //throw custom Exception here
		}
		
		return initialPerks.get(perkName);
	}
}

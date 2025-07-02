package com.elderscrolls.perk.tree.objects;

/**
 * Constants for perks
 */
public class PerkConstants {
	//Skill name constants
	public static final String ALTERATION_SKILL_NAME = "Alteration";
	public static final String RESTORATION_SKILL_NAME = "Restoration";
	public static final String ILLUSION_SKILL_NAME = "Illusion";
	public static final String DESTRUCTION_SKILL_NAME = "Destruction";
	public static final String CONJURATION_SKILL_NAME = "Conjuration";
	public static final String ALCHEMY_SKILL_NAME = "Alchemy";
	public static final String ENCHANTING_SKILL_NAME = "Enchanting";
	public static final String ONE_HANDED_SKILL_NAME = "One-Handed";
	public static final String TWO_HANDED_SKILL_NAME = "Two-Handed";
	public static final String HEAVY_ARMOR_SKILL_NAME = "Heavy Armor";
	public static final String LIGHT_ARMOR_SKILL_NAME = "Light Armor";
	public static final String SNEAK_SKILL_NAME = "Sneak";
	public static final String ARCHERY_SKILL_NAME = "Archery";
	public static final String PICKPOCKET_SKILL_NAME = "Pickpocket";
	public static final String SPEECH_SKILL_NAME = "Speech";
	public static final String BLOCK_SKILL_NAME = "Block";
	public static final String SMITHING_SKILL_NAME = "Smithing";
	public static final String LOCKPICKING_SKILL_NAME = "Lockpicking";
	
	//initial perk constants
	public static Perk ALTERATION_INITIAL_PERK = new Perk(false, "Novice Alteration", "Cast novice Alteration spells for half Magicka");
	public static Perk RESTORATION_INITIAL_PERK = new Perk(false, "Novice Restoration", "Cast novice Restoration spells for half Magicka");
	public static Perk ILLUSION_INITIAL_PERK = new Perk(false, "Novice Illusion", "Cast novice Illusion spells for half Magicka");
	public static Perk DESTRUCTION_INITIAL_PERK = new Perk(false, "Novice Destruction", "Cast novice Destruction spells for half Magicka");
	public static Perk CONJURATION_INITIAL_PERK = new Perk(false, "Novice Conjuration", "Cast novice Conjuration spells for half Magicka");
	public static Perk ALCHEMY_INITIAL_PERK = new Perk(false, "Alchemist", "Potions and poisons you make are 20% stronger.");
	public static Perk ENCHANTING_INITIAL_PERK = new Perk(false, "Enchanter", "New enchantments are 20% stronger.");
	public static Perk ONE_HANDED_INITIAL_PERK = new Perk(false, "Armsman", "One-Handed weapons do 20% more damage.");
	public static Perk TWO_HANDED_INITIAL_PERK = new Perk(false, "Barbarian", "Two-Handed weapons do 20% more damage.");
	public static Perk HEAVY_ARMOR_INITIAL_PERK = new Perk(false, "Juggernaut", "Increases armor rating for Heavy Armor by 20%.");
	public static Perk LIGHT_ARMOR_INITIAL_PERK = new Perk(false, "Agile Defender", "Increases armor rating for Light Armor by 20%.");
	public static Perk SNEAK_INITIAL_PERK = new Perk(false, "Stealth", "You are 20% harder to detect when sneaking.");
	public static final Perk ARCHERY_INITIAL_PERK = new Perk(false, "Overdraw", "Bows do 20% more damage.");
	public static final Perk PICKPOCKET_INITIAL_PERK = new Perk(false, "Light Fingers", "Pickpocketing bonus of 20% item weight and value reduce pickpocketing odds.");
	public static final Perk SPEECH_INITIAL_PERK = new Perk(false, "Haggling", "Buying and selling prices are 10% better.");
	public static final Perk BLOCK_INITIAL_PERK = new Perk(false, "Shield Wall", "Blocking is 20% more effective.");
	public static final Perk SMITHING_INITIAL_PERK = new Perk(false, "Steel Smithing", "Can create Steel armor and weapons at forges.");
	public static final Perk LOCKPICKING_INITIAL_PERK = new Perk(false, "Novice Locks", "Novice locks are much easier to pick.");
	
	//initial perk HashMap
	public static InitialPerks initialPerks = new InitialPerks();
}

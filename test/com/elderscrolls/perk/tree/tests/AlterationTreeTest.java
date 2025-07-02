package com.elderscrolls.perk.tree.tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import com.elderscrolls.perk.tree.objects.Perk;
import com.elderscrolls.perk.tree.objects.PerkConstants;
import com.elderscrolls.perk.tree.objects.PerkTree;

public class AlterationTreeTest {
	PerkTree alterationTree;
	PerkTree emptyRestorationTree;
	
	@Before
	public void init() {
		emptyRestorationTree = new PerkTree(PerkConstants.RESTORATION_SKILL_NAME);
		alterationTree = new PerkTree(PerkConstants.ALTERATION_SKILL_NAME);
		
		//insert nodes
		alterationTree.insert(false, "Novice Alteration", "Initial perk");
		alterationTree.insert(true, "Alteration Dual Casting", "Dual casting an Alteration strengthens it.");
		alterationTree.insert(false, "Apprentice Alteration", "Cast Apprentice Alteration spells for half magicka.");
		alterationTree.insert(true, "Mage Armor", "Protection spells are twice as strong if not wearing armor.");
		alterationTree.insert(false, "Adept Alteration", "Cast Adept Alteration spells for half magicka.");
		alterationTree.insert(false, "Expert Alteration", "Cast Expert Alteration spells for half magicka.");
		alterationTree.insert(true, "Atronach", "Absorb 10% of a spell's effects.");
		alterationTree.insert(false, "Master Alteration", "Cast Master Alteration spells for half magicka.");
	}
	
	@Test
	public void testIsAtInitialPerk() {
		assertTrue(emptyRestorationTree.getIsAtInitialPerk());
	}
	
	@Test
	public void testNotIsAtInitialPerk() {
		assertFalse(alterationTree.getIsAtInitialPerk());
	}
	
	@Test
	public void testAlterationTreeSkillName() {
		assertEquals("Alteration", alterationTree.getSkillName());
	}
	
	@Test
	public void testValidPerkSearch() {
		String perkName = "Atronach";
		Perk searchPerk = alterationTree.search(perkName);
		assertNotNull(searchPerk);
	}

	@Test
	public void testInvalidPerkSearch() {
		String perkName = "Novice Restoration";
		Perk searchPerk = alterationTree.search(perkName);
		assertNull(searchPerk);
	}
}

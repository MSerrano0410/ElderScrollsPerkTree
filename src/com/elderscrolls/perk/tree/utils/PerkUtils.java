package com.elderscrolls.perk.tree.utils;

import java.util.HashMap;

import com.elderscrolls.perk.tree.objects.Perk;

/**
 * Static utility functions for perks
 */
public class PerkUtils {
	
	/**
	 * Checks for perk in given HashMap
	 * @param perkName - key to search for
	 * @param perks - HashMap to search in
	 * @return - true if perk hashMap is not null or empty and perk exists in hashMap
	 */
	public static boolean perkExistsInHash(String perkName, HashMap<String, Perk> perks) {
		return (perks != null && !perks.isEmpty() && perks.get(perkName) != null);
	}
	
	/**
	 * Prints out name and description of given perk
	 * @param perk - perk to get data from
	 * @return - String with perk data
	 */
	public static String getPerkInformation(Perk perk) {
		return ("Perk Name: " + perk.getPerkName() + ", Perk Description: " + perk.getTooltip());
	}
}

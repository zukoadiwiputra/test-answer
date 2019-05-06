package controller;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zuko
 * HashMapStoreNLoadController class
 */
public class HashMapStoreNLoadController {

	public String store(String args) {
		HashMap<Map<Integer, String>, String> zukoMap = new HashMap<Map<Integer, String>, String>();
		String[] keyValuePairs = args.split("\n");
		
		// iterate over the pairs
		for (String pair : keyValuePairs) 
		{
			// split the pairs to get key and value
			String[] entry = pair.split("=");
			// get first key value
			String firstKey = entry[0].substring(2, 3);
			// parse String to int for first key
			Integer firstKeyInt = Integer.parseInt(firstKey);
			// get second key value
			String secondKey = entry[0].substring(entry[0].lastIndexOf('[' + 1), entry[0].lastIndexOf(']' - 1));
			// insert data to hashmap
			Map<Integer, String> mapKey = new HashMap<Integer, String>();
			mapKey.put(firstKeyInt, secondKey);
			zukoMap.put(mapKey, entry[1]);
		}
		return zukoMap.toString();
	}
	
	public void load(String args) {
		// removing curly bracket from string
		String removeCurlyBracket = args.substring(1, args.length()-2);
		// split each part of string based on ,
		String[] parts = removeCurlyBracket.split(", ");
		// loop for print
		for (String part : parts) {
		    System.out.println(part);
		}
	}
}

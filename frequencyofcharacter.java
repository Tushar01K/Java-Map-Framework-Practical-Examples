package map;

import java.util.Iterator;
import java.util.LinkedHashMap;

public class frequencyofcharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abcdabcad";
		LinkedHashMap<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		for (int i = 0; i < s.length(); i++) {
			if (map.containsKey(s.charAt(i)) == true) {
				int val = map.get(s.charAt(i));
				val++;
				map.put(s.charAt(i), val);

			} else {
				map.put(s.charAt(i), 1);
			}
		}
		System.out.println(map);

	}
}

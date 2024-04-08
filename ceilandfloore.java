
package map;

import java.util.TreeMap;
import java.util.*;
import multithreading.testt;

public class ceilandfloore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeMap<Integer, Integer> tm = new TreeMap<Integer, Integer>();
		tm.put(7, 1);
		tm.put(2, 2);
		tm.put(3, 3);
		tm.put(5, 3);
		tm.put(1, 3);
		tm.pollFirstEntry();

		System.out.println(tm.ceilingKey(5));
		System.out.println(tm.floorKey(4));
	}

}

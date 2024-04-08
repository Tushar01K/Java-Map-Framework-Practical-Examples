package hashmap;

import java.util.HashMap;

public class differenttypesofmethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, Integer> map = new HashMap<>();
		map.put(1, 1);
		map.put(2, 2);
		map.put(3, 3);
		map.put(4, 4);

		System.out.println(map.values());
		boolean contkey = map.containsKey(3);
		System.out.println(contkey);
		boolean contvalue = map.containsValue(4);
		System.out.println(contvalue);
		boolean empty = map.isEmpty();
		System.out.println(empty);

//add duplicate key is replace the new value
		map.put(1, 100);
		System.out.println(map);
		
	}

}

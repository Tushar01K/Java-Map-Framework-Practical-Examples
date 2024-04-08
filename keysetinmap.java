package map;

import java.util.HashMap;

public class keysetinmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> hm=new HashMap<Integer, String>();
		hm.put(1, "q");
		hm.put(2, "d");
		hm.put(3, "d");
		
		System.out.println(hm.keySet());
	}

}

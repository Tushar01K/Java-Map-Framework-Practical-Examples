package map;

import java.util.HashMap;

public class removeduplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [] a= {1,2,2,3,4,4,5,6,6,7,7,8,8,9,9};
HashMap<Integer, Integer> hm=new HashMap<Integer, Integer>();
for(int data : a) {
	hm.put(data, null);
}
System.out.println(hm.keySet());
	}

}

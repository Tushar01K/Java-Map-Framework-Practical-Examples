package map;

import java.util.HashSet;
import java.util.Iterator;



public class iteratormethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashSet<Integer>  set=new HashSet<Integer>();
set.add(11);
set.add(3);
set.add(5);
set.add(6);
set.add(9);
for(int data : set) {
	System.out.println(data);
}
Iterator<Integer> it = set.iterator();
while(it.hasNext()) {
	System.out.println(it.next());
}

	}

}

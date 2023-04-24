package misc;

import java.util.LinkedList;
import java.util.List;

public class LinkList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list = new LinkedList<Integer>();
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		
		System.out.println(list);
		
		list.add(3, 6);
		System.out.println(list);
		
		list.remove(2);
		System.out.println(list);
		list.remove(Integer.valueOf(6));
		System.out.println(list);

	}

}

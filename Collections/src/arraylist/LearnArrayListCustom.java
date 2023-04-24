package arraylist;

import java.util.ArrayList;
import java.util.List;

public class LearnArrayListCustom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> list = new ArrayList<Student>();
		System.out.println(list.size());
		Student st1 = new Student(1,1);
		list.add(st1);
		list.add(new Student(2,3));
		list.add(new Student(3,3));
		System.out.println(list.size());
		Student st4 = new Student(1,1);
		if(list.contains(st4))
		{
			System.out.println("yes");
		}
		else
			System.out.println("no");
		
		System.out.println(st1.hashCode());
		System.out.println(st4.hashCode());
		System.out.println(list.size());
		list.remove(st4);
		System.out.println(list.size());
		
	}
/*
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
*/
	/*
	@Override
	public boolean equals(Object obj) {
		boolean ret = false;
		if(obj instanceof )
		return super.equals(obj);
	}
	*/
	
}

package equalshashcode;

import java.util.Comparator;
import java.util.HashSet;
import java.util.TreeSet;

import arraylist.Student;
class MyCmp implements Comparator<Student>
{
	public int compare(Student a,Student b)
	{
		return b.age-a.age;
	}
}
public class SetExample {
	public static void main(String[] args) {
		TreeSet<Student> hs = new TreeSet<Student>(new MyCmp());
		hs.add(new Student(1,1));
		hs.add(new Student(2,2));
		hs.add(new Student(3,3));
		hs.add(new Student(1,1));
		System.out.println(hs);
	}
}

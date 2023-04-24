package stackqueue;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

import arraylist.Student;

class CompareByRoll implements Comparator<Student>
{

	@Override
	public int compare(Student o1, Student o2) {
		if(o1.roll == o2.roll)
		{
			return o2.age - o1.age ;
		}
		else
			return o1.roll-o2.roll;
	}
	
}
public class CustomPriorityQueue {
    public static void main(String[] args) {

        Queue<Student> pq = new PriorityQueue<Student>(new CompareByRoll());

        pq.offer(new Student(1,1));
        pq.offer(new Student(2,2));
        pq.offer(new Student(3,3));
        pq.offer(new Student(2,3));

        System.out.println(pq);
        System.out.println(pq.peek());
        pq.poll();
        System.out.println(pq);

        System.out.println(pq.peek());

    }
}

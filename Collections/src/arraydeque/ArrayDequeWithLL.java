package arraydeque;

import java.util.Deque;
import java.util.LinkedList;

public class ArrayDequeWithLL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Deque<Integer> dq = new LinkedList<Integer>();
        
        dq.offer(23);
        dq.offerFirst(12);
        dq.offerLast(45);
        dq.offer(26);

        System.out.println(dq);

        System.out.println(dq.peek());
        System.out.println(dq.peekFirst());
        System.out.println(dq.peekLast());

        System.out.println(dq.poll());
        System.out.println("poll() " +dq);

        System.out.println(dq.pollFirst());
        System.out.println("pollFirst() " +dq);

        System.out.println(dq.pollLast());
        System.out.println("pollLast() " +dq);
        
        dq.offer(23);
        dq.offerFirst(12);
        dq.offerLast(45);
        dq.offer(26);
        
        System.out.println(dq);
        
        dq.remove(45);
        System.out.println(dq);
	}

}

package sorting;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

class myCmp implements Comparator<Integer>
{
	public int compare(Integer a,Integer b)
	{
		return b-a;
	}
}

public class SortExample1
{
    public static void main(String[] args)
    {
        // Note that we have Integer here instead of
        // int[] as Collections.reverseOrder doesn't
        // work for primitive types.
        Integer[] arr = {13, 7, 6, 45, 21, 9, 2, 100};
    	//int[] arr = {13, 7, 6, 45, 21, 9, 2, 100};
        //Collections.reverseOrder()
 
        // Sorts arr[] in descending order
        Arrays.sort(arr,new myCmp());
 
        System.out.printf("Modified arr[] : %s",
                          Arrays.toString(arr));
    }
}
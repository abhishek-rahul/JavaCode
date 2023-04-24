package arraylist;

import java.util.ArrayList;

public class ArrayArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<ArrayList<Integer> > list = new ArrayList<ArrayList<Integer>>();
		for(int i=1;i<=5;i++)
		{
			ArrayList<Integer> arr = new ArrayList<Integer>();
			for(int j=1;j<=5;j++)
			{
				arr.add(j*i);
			}
			list.add(arr);
		}
		for(int i=1;i<=5;i++)
		{
			ArrayList<Integer> arr = list.get(i-1);
			for(int j=1;j<=5;j++)
			{
				System.out.print(arr.get(j-1)+" ");
			}
			System.out.println();
		}
		
	}

}

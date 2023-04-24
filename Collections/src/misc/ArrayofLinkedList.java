package misc;

import java.util.Iterator;
import java.util.LinkedList;

public class ArrayofLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<String>[] vertex = new LinkedList[5]; 
		for(int i=0;i<5;i++)
		{
			if(vertex[i]==null)
			{
				vertex[i] = new LinkedList<String>();
			}
			vertex[i].add("ab");
			vertex[i].add("bc");			
		}
		
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<vertex[j].size();j++)
			{
				System.out.println(vertex[j].get(j));
			}
		}
		   		
	}

}

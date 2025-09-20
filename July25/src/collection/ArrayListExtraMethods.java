package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExtraMethods {
	
	public static void main(String[] args) {
		
		ArrayList list=new ArrayList();
		list.add("avdhut");
		list.add(10);
		list.add('x');
		list.add(true);
		list.add(null);
		
		System.out.println(list);
		
		list.add(2,"java");		//adding object at 2nd location in arraylist
		System.out.println(list);
		
		list.set(2, "python");
		System.out.println(list);
		
		list.add("c");
		list.add("c++");
		list.add(".net");
		
				
		System.out.println(list);
		
		//removing the values without using remove multiple times
		
		ArrayList list1=new ArrayList();
		list1.add("c");
		list1.add("c++");
		list1.add(".net");
		list1.add(10);
		list1.add("python");
		list.removeAll(list1);
		
		System.out.println(list);
		
		/*
		//normal for loop
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i));
		}
		
		//enhanced for loop -- when we are not aware on type of data
		for(Object x:list)
		{
			System.out.println(x);
		}
		
		//to access the values from ArrayList
		Iterator it=list.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}*/
	
		
		
		
		/*
		//for specific type of arraylist
		ArrayList<Integer> list1=new ArrayList();
		list1.add(25);
		list1.add(35);
		list1.add(45);
		for(int z:list1)
		{
			System.out.println(z);
		}*/
		
		
	}
}
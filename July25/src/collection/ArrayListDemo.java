package collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Declaration -- How to create an ArrayList
			
		//List myList=new ArrayList();
		
		ArrayList list=new ArrayList(); //Heterogenous
		list.add(100);
		list.add(10.5);
		list.add("AVDHUT");
		list.add('c');
		list.add(true);
		list.add(null);
		System.out.println(list);
		list.add(0, "First");
		System.out.println(list);
		list.add(0, "Zero");
		list.add(5);
		//list.add(10, "Ten"); //will be error as we dont have the location 10
		System.out.println(list);
		
		System.out.println("Length :"+list.size());
		
		list.remove(2);		//this is index
		System.out.println(list);
		list.remove(5);		//this is index
		System.out.println(list);
		
		list.remove(new Integer(5));
		System.out.println(list);
		
		list.remove(new Double(10.5));
		System.out.println(list);
		
		list.remove(null);
		System.out.println(list);
		
		list.remove(new Character('c'));
		System.out.println(list);
		
		list.removeAll(list);
		System.out.println(list);
		
		//list.remove(100);
		
		ArrayList<String> myList=new ArrayList<String>();
		myList.add("welcome");
		myList.add("in");
		myList.add("Collection");
		System.out.println(myList);
		
		for(String str:myList)
		{
			System.out.println(str);
		}
		
		ArrayList<Integer> myList1=new ArrayList();
		myList1.add(null);
		myList1.add(15);
		myList1.add(12);
		System.out.println(myList1);
		
		
		
		
		
	}

}




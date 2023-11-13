package collectionExample;

import java.util.HashMap;
import java.util.Map.Entry;

public class Assignment1 {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Student hashmap
//		store roll no and mark in ti
//		find who is topper of the batch
//		rollno, marks, topper

		HashMap<Integer,Integer> student=new HashMap<Integer,Integer>();
		student.put(1, 300);
		student.put(2, 434);
		student.put(3, 599);
		student.put(4, 593);
		student.put(5, 459);
		student.put(6, 434);
		student.put(7, 592);
		student.put(8, 420);
		int j=1;
		int h1=1;
System.out.println(student);
		
		for(Entry<Integer, Integer> entry:student.entrySet())
		{
			//System.out.println(entry.getKey());
			Integer i=entry.getValue();
			Integer k=entry.getKey();
			if(i>j)
			{
				j=i;
				h1=k;
			}
			}
	
		System.out.println("Roll no of the Topper of the class is "+h1+ " with the marks of "+student.get(h1));
		

	}

}

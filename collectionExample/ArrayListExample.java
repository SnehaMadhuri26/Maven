package collectionExample;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> roll_no= new ArrayList<Integer>();
		roll_no.add(1000);
		roll_no.add(1001);
		roll_no.add(1007);
		roll_no.add(0, 10077);
		System.out.println(roll_no);
		Collections.sort(roll_no);
		System.out.println(roll_no);
		System.out.println(roll_no.size());
		System.out.println(roll_no.contains(1000));
		System.out.println(roll_no.contains(200));
		
		System.out.println(roll_no.get(3));
		roll_no.add(4, 867676);
		//roll_no.clear();
		System.out.println(roll_no);
		System.out.println(roll_no.indexOf(1007));
roll_no.remove(1);
System.out.println(roll_no);
for(int i=0;i<roll_no.size();i++)
{
	System.out.println(roll_no.get(i));
}
	}

}

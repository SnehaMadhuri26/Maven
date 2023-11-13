package collectionExample;

import java.util.HashSet;

import javax.swing.text.html.HTMLDocument.Iterator;

public class HashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<String> trainee=new HashSet<String>();
		trainee.add("Sneha");
		trainee.add("Sindhuja");
		trainee.add("Sindhuja");
		System.out.println(trainee);
		trainee.add("Saloni");
		java.util.Iterator<String> itr=trainee.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
			

	}

}

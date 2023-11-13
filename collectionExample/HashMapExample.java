package collectionExample;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


public class HashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> trainee=new HashMap<Integer,String>();
		trainee.put(0, "Sneha");
		trainee.put(1, "Amitha");
		trainee.put(2, "Hari Krishna");
		trainee.put(3, "Sindhuja");
		System.out.println(trainee);
		System.out.println(trainee.containsValue("Sneha"));
		System.out.println(trainee.containsKey(3));
		trainee.remove(0);
		System.out.println(trainee);
		trainee.put(3, "Hari Krishna");//It overrides
		trainee.put(5, null);
		trainee.put(4, "Sneha");
		System.out.println(trainee);
		
		for(Entry<Integer, String> entry:trainee.entrySet())
		{
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
//for(Set<Integer> key=trainee.keySet())
//{
		//System.out.println("Key"+key);


	//}
	}
}

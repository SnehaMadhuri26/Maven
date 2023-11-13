package collectionExample;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//Hashmap with city name and its highest temp
//how many city having temperature more than 30 degree
		
		HashMap<String,Integer> hightemp =new HashMap<String,Integer>();
		hightemp.put("Anantapur", 44);
		hightemp.put("Banglore", 26);
		hightemp.put("Delhi", 53);
		hightemp.put("Hyderabad", 30);
		hightemp.put("Thirumala", 21);
		hightemp.put("Thiruvannamalai", 35);
		System.out.println(hightemp.size());
		
		ArrayList<Integer> q=new ArrayList<Integer>();
		ArrayList<String> r=new ArrayList<String>();
		
		for(Entry<String, Integer> entry:hightemp.entrySet())
		{
			Integer w=entry.getValue();
			String x=entry.getKey();
		
		     if(w>30) {
				q.add(w);
				r.add(x);
			}
			
		}
		
//		System.out.println(q);
//		System.out.println(r);
		for(int k=0;k<r.size();k++)
		{
			System.out.println("City having temparture greater than 30 is: "+r.get(k)+" with the temparature of"+" "+ hightemp.get(r.get(k))+" degrees");
		}
		
	}

}

package week3.day2Assignment;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String data  = "abbaba";
		
		char data1[] = data.toCharArray();
		int  charlength = data1.length;
		
		char key1=0;
		int maxocc = 0; 
		
		Map<Character,Integer> hashmap = new HashMap<Character,Integer>();
		
		for(int i=0;i<charlength;i++)
		{
			
				hashmap.put(data1[i],hashmap.getOrDefault(data1[i], 0)+1);
				
		}
		
		Set<Entry<Character, Integer>> Mapset = hashmap.entrySet();
		
		for (Entry<Character, Integer> entry : Mapset)
		{
			if(entry.getValue()>maxocc)
			{
				key1 = entry.getKey();
				maxocc = entry.getValue();
			}else 
			{
				 key1=entry.getKey();
				 maxocc=entry.getValue();
			}
		}
		
		System.out.println(key1);
		System.out.println(maxocc);
	}

}

package week3.week3day2Assignment;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

public class FindNumbersOccurances {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number[] = {2,3,5,6,3,2,1,4,2,1,6,-1};
		
		Map<Integer,Integer> treemap = new TreeMap<Integer,Integer>();
		
		for(int i=0;i<number.length;i++)
		{
			if (treemap.containsKey(number[i]))
			{
			
				treemap.put(number[i],treemap.get(number[i])+1);
			}
			else
			{
				treemap.put(number[i],1);
			}
		}
		
		Set<Entry<Integer,Integer>> entry = treemap.entrySet();
		for (Entry<Integer, Integer> entry2 : entry) {
			System.out.println("number is " +entry2.getKey()+" Occurence is " +entry2.getValue());
		}
	}

}

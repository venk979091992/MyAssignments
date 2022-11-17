package javaChallenges;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;
import org.apache.commons.lang3.text.WordUtils;

public class Challenge1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String text = "luffy is still joyboy";
		int length = text.length();
		int arrayindex= 0;
		//String lastwrd = null;
		//System.out.println("length if string is " +length);
		
		int spacelastindex = text.lastIndexOf(" ");
		
				
		//System.out.println("the last space is " +spacelastindex);
		
		char word[] = new char[length-spacelastindex-1];
		
		for(int i=spacelastindex+1;i<length;i++)
			{
			char c = text.charAt(i);
			//System.out.println("characer is " +c);
			//System.out.println("the arrayindex is  " +arrayindex);
			
			word[arrayindex]=c;
			arrayindex= arrayindex+1;
			 
			}
		
		System.out.println("the last word is " +String.valueOf(word));

		
		
	}

}

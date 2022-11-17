package javaChallenges;

public class PalindromeChallenge2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "";
		s = s.replaceAll("\\s", "");
		s = s.replaceAll(",", "");
		s = s.replaceAll(":", "");
		s = s.toLowerCase();
		System.out.println("***check for plaindrome***");
		String rev="";
		boolean ans = false;
		 
        for (int i = s.length() - 1; i >= 0; i--) {
            rev = rev + s.charAt(i);
        }
 
        // Checking if both the strings are equal
        if (s.equals(rev)) {
            ans = true;
            System.out.println("true" );
        }
        else
        {
        	System.out.println("false" );
        }
	}

}

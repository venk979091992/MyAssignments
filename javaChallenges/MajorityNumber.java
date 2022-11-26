package javaChallenges;


public class MajorityNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int myarray [] = {6,9,6,8,9,9,9};
		int n = myarray.length;
		
		int index = 0;
		int maxcount2=0;
		
		for(int i =0;i<n;i++)
		{
			int count =0;
			for(int j =0;j<n;j++)
			{
				
				if(myarray[i]==myarray[j])
				{
					count = count+1;
					
				}
				if (count > maxcount2) {
					maxcount2 = count;
	                index = i;
	            }
			}
			
	    }
			
		if (maxcount2 > (n / 2))
            System.out.println(myarray[index]);
 
        else
            System.out.println("No Majority Element");
	}

}

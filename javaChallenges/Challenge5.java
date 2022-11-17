package javaChallenges;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;

public class Challenge5  
{     
    //isHappyNumber() will determine whether a number is happy or not  
    public static  int isHappyNumber(int num){  
        int rem = 0, sum = 0;  
          
        while(num > 0){  
        	
        	//System.out.println("sum is " +sum);
            rem = num%10;  
            sum = sum + (rem*rem);  
            num = num/10;  
            
        }  
        
        return sum;  
    }  
      
    public static void main(String[] args) {  
        int num = 16;  
        int result = num;  
          
        while(result != 1 && result != 4){  
            result = isHappyNumber(result);  
            //System.out.println("results is " +result);
        }  
        //System.out.println("results is " +result); 
        //Happy number always ends with 1  
        if(result == 1)  
            System.out.println(num + " is a happy number"); 
        else
        	System.out.println(num + " is not a happy number");
          
    }  
}  
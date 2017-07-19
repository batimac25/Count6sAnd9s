import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Count6sAnd9s {
	public int calculateNumOf6s(List<Integer> collectionOfNumbers)
	{  
		
	    int sum = 0;
	    int count6 = 0;
	    Iterator ls = collectionOfNumbers.iterator();
	  	for(int i =0; i<collectionOfNumbers.size();i++)
		{  
			if(collectionOfNumbers.get(i)== 6)
			{
				count6++;
				
			}
			
			//sum = sum + collectionOfNumbers.get(i);
		}
		return count6;
	
	}
	public int calculateNumOf9s(List<Integer> collectionOfNumbers)
	{  
		
	    int sum = 0;
	    int count9 = 0;
	  	for(int i =0; i<collectionOfNumbers.size();i++)
		{  
			if(collectionOfNumbers.get(i)== 9)
			{
				count9++;
				
			}
			
			//sum = sum + collectionOfNumbers.get(i);
		}
		return count9;
	
	}
	public int con6s(List<Integer> collectionOfNumbers)
	{     
		
		int conCount6 = 1;
		 ListIterator ls = collectionOfNumbers.listIterator();
			for(int i =0; i<collectionOfNumbers.size();i++)
			{  
				if(collectionOfNumbers.get(i)== 6)
				{
					if(collectionOfNumbers.get(i)==collectionOfNumbers.get(i+1))
					{
						conCount6++;
					}
					
				}
			
		}
			return conCount6;
	}
	public int con9s(List<Integer> collectionOfNumbers)
	{     
		
		int conCount9 = 1;
		 ListIterator ls = collectionOfNumbers.listIterator();
			for(int i =0; i<collectionOfNumbers.size();i++)
			{  
				if(collectionOfNumbers.get(i)== 9)
				{
					if(collectionOfNumbers.get(i)==collectionOfNumbers.get(i+1))
					{
						conCount9++;
					}
					
				}
			
		}
			return conCount9;
	}
	public String NumOf6sAnd9s(int count1,int count2)
	{  String result = "The count of 6 is "+count1+" And the count of 9 is "+count2;
	   //System.out.println("The count of 6 is "+count6+" And the count of 9 is "+count9);
	   return result;
	}
	public String NumOfCon6sAnd9s(int count1,int count2)
	{  String result = "Number of consecutive 6 is "+count1+" And the Number of consecutive 9 is "+count2;
	   //System.out.println("The count of 6 is "+count6+" And the count of 9 is "+count9);
	   return result;
	}
	
/*	public static void main(String args[])
	{   
		int result = 0;
		int expected = 0;
		List<Integer> list = null;
		Count6sAnd9s count69 = new Count6sAnd9s();
		//#1 expect 13
		list = Arrays.asList(3,7,9,2,4,7,12,9,7,2,2,1,4,3,7,1);
		expected =13;
		 result = count69.calculateSumOfEvery5th(list);
		 
		if (result== expected)
		{
			System.out.println("Pass");
	
		}
		else
		{
			System.out.println("FAIL: Expected "+expected+"got "+result);
		}
		// #2 expected 12
		list = Arrays.asList(5,9,4,2,6,1,12,11,14,3,8,2,1,0,-1,-2,3);
		expected =12;
		 result = count69.calculateSumOfEvery5th(list);
		 
		if (result== expected)
		{
			System.out.println("Pass");
	
		}
		else
		{
			System.out.println("FAIL: Expected "+expected+"got "+result);
		}
        
		
		
	}*/

}

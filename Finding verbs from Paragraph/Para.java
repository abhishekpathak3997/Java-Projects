/*
Name:Abhishek Pathak
Date:26/08/17
*/
import java.util.*;
	public class Para
	{
	public static void main(String args[])
	{
	String str;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter your paragraph");
	str=sc.nextLine();
	String str1[]=str.split(" ");
	
	for(int i=0;i<str1.length;i++)
	{	
		//System.out.println("str[]:"+str1[i]);
		int length=str1[i].length();

		if(length>3)
		{
		if(str1[i].charAt(length-3)=='i' && str1[i].charAt(length-2)=='n' && str1[i].charAt(length-1)=='g')
		{
			System.out.println(str1[i]);
			
		}	
		}
		
		
	}//end of for loop
	}//end of main method
	}//end of class
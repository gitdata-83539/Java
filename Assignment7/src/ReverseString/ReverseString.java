package ReverseString;

import java.util.*;
public class ReverseString {
	
	public static void main(String [] args)
	{	//*first method*
		
		StringBuilder str= new StringBuilder("");
		
		Scanner sc=new Scanner(System.in);
		str.append(sc.nextLine());
		StringBuilder mtr=new StringBuilder(str.reverse());
		//mtr=str.reverse();
		if(str.equals(mtr))
		{   System.out.println(mtr);
		
		    System.out.println(str);
			System.out.println("string has been reversed");
		}
		sc.close();
		
		//second method
		/*String s;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter string:");
		s=sc.nextLine();
		int j=1;
		char t[]= new char[10];
		for(int i=s.length();i>0;i--)
		{
			t[j]=s.charAt(i-1);
			j++;
		}
		System.out.println("The reversed string is: ");
		
		for(int i=0;i<t.length;i++)
		{
			System.out.println(t[i]);
		}*/
		
		//third method
		/*String s;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter string:");
		s=sc.nextLine();
		for(int i=s.length();i>0;i--)
		{
			System.out.print("the reversed string is: "+s.charAt(i-1));
			
		}*/
		
				
				
	}
}

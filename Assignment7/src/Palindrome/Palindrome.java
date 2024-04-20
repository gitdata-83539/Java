package Palindrome;
import java.util.*;
import java.lang.*;
public class Palindrome {

	public static void main(String[] args) {
		String s;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter string:");
		s=sc.nextLine();
		int j=1;
		String r="";
		for(int i=s.length();i>0;i--)
		{
			r=r+s.charAt(i-1);
			
		}
		if(r.equals(s))
		{
		System.out.println("String is a palindrome");
		}
		else
		{
			System.out.println("not a palindrome");
		}
	}

}

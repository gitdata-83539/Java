package length;

import java.util.Scanner;

public class Length {

	public static void main(String [] args)
	{
		String str;
		Scanner sc=new Scanner(System.in);
		str=sc.nextLine();
		String a[];
		a=str.split(" ");
		System.out.println("the total no. of words in a string is: "+a.length);
		}
	
}

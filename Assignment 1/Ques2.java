package workspace1;
import java.util.Scanner;

public class Ques2 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first double value :");
		if(sc.hasNextDouble()) {
			if(sc.hasNextInt()) {
			System.out.println("Error:Not a double value");
			sc.close();
			}
			else
			{
		double num1=sc.nextDouble();
		System.out.println("Enter the second double value :");
		if(sc.hasNextDouble()) {
			if(sc.hasNextInt())
			{
			System.out.println("Error:Not a double value");
			sc.close();
		}
			else
			{
		
		double num2=sc.nextDouble();
		double average=(num1 +num2)/2;
		System.out.println("Average of the two double values :"+average);
		
			}

	}
		else
		{
			System.out.println("invalid double type number");
		}
		}

}
		else
		{
			System.out.println("Invalid double type number");
			
		}	}
}
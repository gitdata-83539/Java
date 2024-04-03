package workspace1;
import java.util.Scanner;

public class Ques1 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number-");
		int num =sc.nextInt();
		System.out.println("Given number = "+num);
		System.out.println("Binary Equivalent is = "+ Integer.toBinaryString(num));
		System.out.println("Octal Equivalent is = "+Integer.toOctalString(num));
		System.out.println("Hexadecimal Equivalent is ="+Integer.toHexString(num));
		
		

	}

}

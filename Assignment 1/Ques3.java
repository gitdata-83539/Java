package workspace1;
import java.util.*;
public class Ques3 {

	public static void main(String[] args) {
	
		int choice,q;
		double total=0;
		Scanner sc=new Scanner(System.in);
		do
		{
			System.out.println("Star hotel");
			System.out.println("(0) for exit");
			System.out.println("(1) idli price :Rs50");
			System.out.println("(2) dhokla price:Rs 60");
			System.out.println("(3) samosa price: Rs 20");
			System.out.println("(4) patties price :Rs 30");
			System.out.println("(5) Dosa price :Rs 80");
			System.out.println("(6) Total bill");
			System.out.println("Enter choice");
			choice =sc.nextInt();
					switch(choice)
					{
					case 0:
						System.out.println("Thank you");
						break;
					case 1:
						System.out.println("Enter quantity for idli :");
						 q=sc.nextInt();
						total=total+50*q;
						System.out.println("******************************");
						System.out.println("Order placed successfully");
						System.out.println("******************************");
						break;
					case 2:
						System.out.println("Enter quantity for dhokla:");
						q=sc.nextInt();
						total=total+60*q;
						System.out.println("******************************");
						System.out.println("Order placed successfully");
						System.out.println("******************************");
						break;
					case 3:
					
						System.out.println("Enter quantity for samosa :");
						 q=sc.nextInt();
						total=total+20*q;
						System.out.println("******************************");
						System.out.println("Order placed successfully");
						System.out.println("******************************");
					
						break;
					case 4:
							System.out.println("Enter quantity for patties :");
							q=sc.nextInt();
							total=total+30*q;
							System.out.println("******************************");
							System.out.println("Order placed successfully");
							System.out.println("******************************");
							break;
							
					case 5:
						System.out.println("Enter quantity for dosa :");
						 q=sc.nextInt();
						total=total+80*q;
						System.out.println("******************************");
						System.out.println("Order placed successfully");
						System.out.println("******************************");
						break;
						
					case 6:
						
						
						
						System.out.println("******************************");
						System.out.println("The total Bill : "+total);
						System.out.println("******************************");
						break;
						default:
							System.out.println("wrong choice");
							break;
						
					}
			
		}
		while(choice!=0);
	}
}
		

	



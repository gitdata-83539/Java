package entity;
import java.util.*;

public abstract class Employee implements acceptor{
	private String First_Name;
	private String Last_Name;
	private int SSN;
	
	public Employee()
	{

}

	public String getFirst_Name() {
		return First_Name;
	}

	public void setFirst_Name(String first_Name) {
		First_Name = first_Name;
	}

	public String getLast_Name() {
		return Last_Name;
	}

	public void setLast_Name(String last_Name) {
		Last_Name = last_Name;
	}

	public int getSSN() {
		return SSN;
	}

	public void setSSN(int sSN) {
		SSN = sSN;
	}

	@Override
	public void acceptData(Scanner sc) {
		System.out.println("Enter First Name: ");
		First_Name=sc.next();
		System.out.println("Enter Last Name: ");
		Last_Name=sc.next();
		System.out.println("Enter Social  security Number: ");
		SSN=sc.nextInt();
	
	}

	@Override
	public void displayData() {
		System.out.println("**************************************************");
		System.out.println("Name: "+First_Name+""+Last_Name);
		System.out.println("Social Security number: "+SSN);
		
		
	}
	
}
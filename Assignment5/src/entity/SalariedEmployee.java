package entity;
import java.util.Scanner;

public class SalariedEmployee extends Employee{
	private double weeklySal;
	
	public SalariedEmployee()
	{
		super();
		
	}

	public double getWeeklySal() {
		return weeklySal;
	}

	public void setWeeklySal(double weeklySal) {
		this.weeklySal = weeklySal;
	}
	public void acceptData(Scanner sc)
	{
		super.acceptData(sc);
	System.out.println("Enter weekly salary: ");
	weeklySal=sc.nextDouble();
}
	
public void displayData()
{
	super.displayData();
	System.out.println("weekly sal: "+weeklySal);
	System.out.println(totalSalary());
}

@Override
public double totalSalary() {
 double total=weeklySal;
	return total;
}


}

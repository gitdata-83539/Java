package entity;
import java.util.*;

public class BaseCommissionEmp extends CommissionEmployee{
	private double baseSalary;
	
	public BaseCommissionEmp() {

}
	public void acceptData(Scanner sc)
	{
	super.acceptData(sc);
	System.out.println("Enter base salary:");
	baseSalary=sc.nextDouble();
}
	public void display()
	{
		super.dislayData();
		System.out.println("Commission:"+getCommission());
		System.out.println("Gross sale :"+getGrossSales());
		System.out.println("Base salary :"+baseSalary);
		System.out.println("Total salary:"+totalSalary());
	}
	
	
	@Override
	public double totalSalary()
	{
		double total=0;
		total=((super.getCommission()*getGrossSales())/100)+baseSalary;
		return total;
	}
	public void netSal()
	{
		double sal=totalSalary()+(baseSalary*.10);
		System.out.println("New salary after adding bonus: "+sal);
}
}
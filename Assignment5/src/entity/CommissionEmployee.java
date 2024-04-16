package entity;
import java.util.*;

public class CommissionEmployee extends Employee {
	private double grossSales;
	private double commission;
	
	public CommissionEmployee() {
		
	}
	

	public double getGrossSales() {
		return grossSales;
	}


	public void setGrossSales(double grossSales) {
		this.grossSales = grossSales;
	}


	public double getCommission() {
		return commission;
	}


	public void setCommission(double commission) {
		this.commission = commission;
	}


	@Override
	public double totalSalary() {
		// TODO Auto-generated method stub
		double total=0;
		total=(grossSales*commission)/100;
		return total;
	}
	public void acceptData(Scanner sc)
	{
		super.acceptData(sc);
		System.out.println("Enter Gross sales: ");
		grossSales=sc.nextDouble();
		System.out.println("Enter commission: ");
		commission=sc.nextDouble();
	
}	
	public void dislayData()
	{
		super.displayData();
		System.out.println("Gross Sales: "+grossSales);
		System.out.println("Commission: "+commission);
		System.out.println("Total Salary:"+totalSalary());
	}

}

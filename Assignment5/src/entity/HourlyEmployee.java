package entity;
import java.util.*;
public class HourlyEmployee extends Employee{
	private double hourlyWage;
	private double hoursWorked;
	
	
	
	
	public HourlyEmployee() {
		
	}
	
	
	
	public double getHourlyWage() {
		return hourlyWage;
	}
	public void setHourlyWage(double hourlyWage) {
		this.hourlyWage = hourlyWage;
	}
	public double getHoursWorked() {
		return hoursWorked;
	}
	public void setHoursWorked(double hoursWorked) {
		this.hoursWorked = hoursWorked;
	}
	@Override
	public double totalSalary() {
		// TODO Auto-generated method stub
		double total=0;
		if(hoursWorked<=40)
		{
			total=hoursWorked*hourlyWage;
			
		}
		else if(hoursWorked>40)
		{
			total=40*hourlyWage+(hoursWorked-40)*hourlyWage*1.5;
			
		}
		return total;
	}
	public void acceptData(Scanner sc)
	{
		super.acceptData(sc);
		System.out.println("enter hourly wage: ");
		hourlyWage=sc.nextDouble();
		System.out.println("enter hours worked: ");
		hoursWorked=sc.nextDouble();
	}
	public void displayData()
	{
		super.displayData();
		System.out.println("Hours Worked: "+hoursWorked);
		System.out.println("Hourly Wage: "+hourlyWage);
		System.out.println("Total Salary: "+totalSalary());
	}
	
	
	
}
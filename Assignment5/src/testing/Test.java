package testing;
import java.util.*;
import entity.*;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		Employee e1;
		BaseCommissionEmp b;
		int choice,flag=1;
		while(flag!=0)
		{
		System.out.println("***********************************");	
		System.out.println("Enter 1 to get total salary of salaried employee");
		System.out.println("Enter 2 to get total salary of hourly employee");
		System.out.println("Enter 3 to get total salary of commission employee");
		System.out.println("Enter 4 to get total salary of base+commission employee");
		System.out.println("Enter 0 to exit");
		System.out.println("***********************************");
		
		
		System.out.println("Enter choice: ");
		choice=sc.nextInt();
		
		if(choice==1)
		{
			e1=new SalariedEmployee();
			e1.acceptData(sc);
			e1.displayData();
			e1.totalSalary();
		}
		else if(choice==2)
			{
				e1=new HourlyEmployee();
				e1.acceptData(sc);
				e1.displayData();
				e1.totalSalary();
			}
		else if(choice==3)
			{
				e1=new CommissionEmployee();
				e1.acceptData(sc);
				e1.displayData();
				e1.totalSalary();
			}
		else if(choice==4)
			{
				e1=new BaseCommissionEmp();
				e1.acceptData(sc);
				e1.displayData();
				e1.totalSalary();
				if(e1 instanceof BaseCommissionEmp)
				{
					b =(BaseCommissionEmp)e1;
					b.netSal();
				}
			}
		else if(choice==0)
		{   System.out.println("Thankyou");
			flag=0;
		}
		}
		
		
		
		
		
		
		
	}

}

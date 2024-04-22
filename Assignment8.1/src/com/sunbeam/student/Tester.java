package com.sunbeam.student;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Studentcity implements Comparator<Student>
{

	@Override
	public int compare(Student o1, Student o2)
	{
		
		return o1.getCity().compareTo(o2.getCity());
	}
	public static Comparator<Student> sortcity() 
	{
		Comparator<Student> s1=new Studentcity();
		return s1;
	}
	
}
class studentmarks implements Comparator<Student>
{

	@Override
	public int compare(Student o1, Student o2)
	{
		
		return Double.compare(o2.getMarks(), o1.getMarks());
	}
	public static Comparator<Student> sortmarks() 
	{
		Comparator<Student> s1=new studentmarks();
		return s1;
	}
	
}
class studentnames implements Comparator<Student>
{

	@Override
	public int compare(Student o1, Student o2)
	{
		
		return o1.getName().compareTo(o2.getName());
	}
	public static Comparator<Student> sortnames() 
	{
		Comparator<Student> s1=new studentnames();
		return s1;
	}
	
}


public class Tester
{

	public static void main(String[] args)
	{
		int choice;
		Scanner sc= new Scanner(System.in);
		Student s[]=new Student[5];
		s[0]=new Student(2,"avdhut","kadegaon",40);
		s[1]=new Student(1,"sachin","marathwada",80);
		s[2]=new Student(4,"virat","bengluru",70);
		s[3]=new Student(5,"dhoni","chennai",50);
		s[4]=new Student(3,"rohit","mumbai",90);
		

		do
		{
			System.out.println("1. sorted on their city (asc)	2. sorted on their on marks (desc)  3. sorted on their on name (asc)	4.sort on rollno");
		
			System.out.print("enter choice");
			choice=sc.nextInt();
			switch (choice)
			{
			
			case 0:
				System.out.println("thanks");
				break;
			
			case 1:
			{
				System.out.println("Before sorting");
				for(Student stu:s)
				{
					System.out.println(stu);
				}
				
				Arrays.<Student>sort(s, Studentcity.sortcity());
				
				System.out.println("After sorting on city(asc)");
				
				for(Student stu:s)
				{
					System.out.println(stu);
				}
				
			}
				break;
				
			case 2:
			{
				System.out.println("Before sorting");
				for(Student stu:s)
				{
					System.out.println(stu);
				}
				Arrays.<Student>sort(s, studentmarks.sortmarks());
				System.out.println("After sorting on marks in descending order");
				
				for(Student stu:s)
				{
					System.out.println(stu);
				}
				
			}
				break;
	
	
			case 3:
			{
				System.out.println("Before sorting");
				for(Student stu:s)
				{
					System.out.println(stu);
				}
				
				Arrays.<Student>sort(s, studentnames.sortnames());
				
				System.out.println("After sorting on marks(asc)");
				
				for(Student stu:s)
				{
					System.out.println(stu);
				}
			}
				break;
			
			case 4:
			{
				System.out.println("Before sorting");
				for(Student stu:s)
				{
					System.out.println(stu);
				}
				
				Arrays.sort(s);
				
				System.out.println("After sorting on roll number(asc)");
				for(Student stu:s)
				{
					System.out.println(stu);
				}
			}
				break;
				
			default:
				System.out.println("enter a valid choice");
				break;
			}
			
		}while(choice!=0);
		
	
		
		
	}

}
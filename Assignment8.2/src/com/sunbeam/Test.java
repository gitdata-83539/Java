package com.sunbeam;

import java.util.Comparator;
import java.util.Scanner;



public class Test 
{
    public static <T> void sort(T[] arr,Comparator<? super T>c) 
    {
    	for(int i=0;i<arr.length;i++)
    	{
    		for(int j=i+1;j<arr.length;j++)
    		{
    			if(c.compare(arr[i], arr[j])>0)
    			{
    				T temp=arr[i];
    				arr[i]=arr[j];
    				arr[j]=temp;
    			}
    		}
    	}
	  	
	}
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
		
		class sortrollnowi implements Comparator<Student>
		{

			@Override
			public int compare(Student o1, Student o2) 
			{
			  return o1.getRoll()-o2.getRoll();
			}
			
		}
		
		 System.out.println("Before sorting :");
		
		 for(Student s1:s)
		 {
			 System.out.println(s1);
		 }
		
		  
		 Test.<Student>sort(s, new sortrollnowi());
	
		 
		 System.out.println("after sorting :");
		 for(Student s1:s)
		 {
			 System.out.println(s1);
		 }
	}

}

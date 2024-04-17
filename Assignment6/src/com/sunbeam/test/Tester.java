package com.sunbeam.test;
import com.sunbeam.entity.ExceptionLineTooLong;
import java.util.*;
public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str;
		System.out.println("Enter String: ");
		str=sc.nextLine();
		try
		{
		int len=str.length();
		if(len>80)
		{
			throw new ExceptionLineTooLong("Length Must be within 80 characters",len);
		}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			sc.close();
		}
	}

}

package com.sunbeamifo;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;


public class Program {

	public static void main(String[] args) {
		
		List<Student> stuList = new LinkedList<>();
		stuList.add(new Student(5, "Imran", 1000));
		stuList.add(new Student(3, "Irfan", 4000));
		stuList.add(new Student(2, "Javed", 3000));
		stuList.add(new Student(4, "Mansoor", 5000));
		stuList.add(new Student(1, "Armaan", 2000));
		
		
		System.out.println("Before Sort - ");
		for (Student student : stuList)
			System.out.println(student);

		System.out.println("After Natural Ordering --> ");
		Collections.sort(stuList);
		for (Student student : stuList)
			System.out.println(student);

		System.out.println("Sorting on stu name -->");
		
		class StuNameComparator implements Comparator<Student> {
			@Override
			public int compare(Student o1, Student o2) {
				return o1.getName().compareTo(o2.getName());
			}
		}

       Comparator<Student> stuNameComparator = new StuNameComparator();
		Collections.sort(stuList, stuNameComparator);

		for (Student student : stuList)
			System.out.println(student);

		Student stu = new Student();
		stu.setRollNum(3);
		if (stuList.contains(stu.getRollNum()))
			System.out.println("Student exists");
		else
			System.out.println("Student not found");

	}

}

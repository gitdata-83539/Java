package com.sunbeamifo;

import java.util.Objects;

public class Student implements Comparable<Student> {
	private int rollNum;
	private String name;
	private int marks;
	
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Student(int rollNum, String name, int marks) {
		super();
		this.rollNum = rollNum;
		this.name = name;
		this.marks = marks;
	}


	@Override
	public String toString() {
		return "Student [rollNum=" + rollNum + ", name=" + name + ", marks=" + marks + "]";
	}


	public int getRollNum() {
		return rollNum;
	}


	public void setRollNum(int rollNum) {
		this.rollNum = rollNum;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getMarks() {
		return marks;
	}


	public void setMarks(int marks) {
		this.marks = marks;
	}
    
	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		else if (this == obj)
			return true;
		else if (obj instanceof Student) {
			Student s = (Student) obj;
			return s.rollNum == this.rollNum;
		}
		return false;
	}
@Override
	public int compareTo(Student o) {
		return this.rollNum - o.rollNum;
	}

}
	


	
	
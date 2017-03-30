package javaQue;

import java.util.Date;

public class Employee {
	
	private Date joiningDate;
	private String name;
	private int age;
	private long salary;
	private char activeYn;
	
	
	public Employee(Date joiningDate, String name, int age, long salary, char activeYn) {
		super();
		this.joiningDate = joiningDate;
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.activeYn = activeYn;
	}
	public Date getJoiningDate() {
		return joiningDate;
	}
	public void setJoiningDate(Date joiningDate) {
		this.joiningDate = joiningDate;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	public char getActiveYn() {
		return activeYn;
	}
	public void setActiveYn(char activeYn) {
		this.activeYn = activeYn;
	}
	
	@Override
	public String toString() {
		return "Employee [joiningDate=" + joiningDate + ", name=" + name + ", age=" + age + ", salary=" + salary
				+ ", activeYn=" + activeYn + "]";
	}
	
	
	
	
	
	

}

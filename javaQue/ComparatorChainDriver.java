package javaQue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;

public class ComparatorChainDriver {

	public static void main(String[] args) {
		ArrayList<Employee> listEmployees = new ArrayList<Employee>();
		
		listEmployees.add(new Employee(new Date(2014,6,16),"akshay", 24, 30000, 'Y'));
		listEmployees.add(new Employee(new Date(2016,6,16),"akshay", 25, 15000, 'Y'));
		listEmployees.add(new Employee(new Date(2017,6,16),"altaf", 23, 26000, 'Y'));
		listEmployees.add(new Employee(new Date(2006,6,16),"ajay", 32, 90000, 'Y'));
		listEmployees.add(new Employee(new Date(2012,6,16),"krinil", 27, 35000, 'Y'));
   
		//Collections.sort(listEmployees,new NameComparator());
		
		Collections.sort(listEmployees,new EmployeeChainComparator(new NameComparator(),new AgeComparator()));
		
		for(Employee e : listEmployees)
		{
			System.out.println(e.toString());
		}
	
	}

}

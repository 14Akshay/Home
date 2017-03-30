package javaQue;

import java.util.Comparator;

public class AgeComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o2.getAge()-o1.getAge(); // for desc
		//return o1.getAge()-o2.getAge(); //for asc 
	}

}

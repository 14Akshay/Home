package javaQue;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class EmployeeChainComparator implements Comparator<Employee>{

	private List<Comparator<Employee>> listComparators;
	
	public EmployeeChainComparator(Comparator<Employee>...comparators )
	{
		this.listComparators=Arrays.asList(comparators);
	}

	@Override
	public int compare(Employee o1, Employee o2) {
		for(Comparator<Employee> e: listComparators)
		{
			int result = e.compare(o1, o2);
			if(result!=0)
				return result ;
		}
		return 0;
	}
}

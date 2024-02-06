package javafeatures;

import java.util.Arrays;
import java.util.List;

public class EmpMapEx {

	
	public static void main(String[] args) {
		List<Emp>emps=Arrays.asList(new Emp(11,"raghav",22000.4),new Emp(23,"Sumit",21100.4),new Emp(21,"Archit",25640.32),
				new Emp(65,"Anurag",32564.55),new Emp(54,"Hema",684855.33));
		
		//List<Emp>res=emps.stream().filter(em->em.getEsal()>23456).map(em.Esal->em.Esal.setEsal(em.getEsal()+1000)); return em;).collect(Collectors.toList());)
	emps.stream().map(emp->emp.getEname()+" Khushi raho").forEach(ename->System.out.println(ename));
	emps.stream().filter(emp->emp.getEsal()>22345).map(emp->{emp.setEsal(emp.getEsal()+1000); return emp;}).forEach(emp->System.out.println(emp));
	
	}
}

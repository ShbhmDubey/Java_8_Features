package javafeatures;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class EmpFilterEx {

	public static void main(String[] args) {
	List<Emp>emps=List.of(new Emp(11,"raten",100004),new Emp(12,"anu",20000.2),
			new Emp(14,"aruna",3300.3),
			new Emp(12,"anu",20000.2),
			new Emp(32,"sravya",4000.43));
	emps.stream().filter(emp->emp.ename.charAt(0)=='a')
	.forEach(ee->System.out.println(ee));
	List<Emp>res=emps.stream().filter(emp->emp.esal<30000).collect(Collectors.toList());
	for(Emp ee:res) {
		System.out.println(ee);
	}
	Set<Emp>ss=emps.stream().filter(emp->emp.esal>15000).collect(Collectors.toSet());
	for(Emp ee:ss) {
		System.out.println("Set element is :"+ee);
	}
	
	
	

	}

}

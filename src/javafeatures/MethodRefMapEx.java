package javafeatures;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MethodRefMapEx {
	public static List<Integer> stringToIntNum(List<String>res){
		return res.stream().map(Integer::valueOf).collect(Collectors.toList());
	}
	public static List<Integer> evalLength(List<String>res){
		return res.stream().map(String::length).collect(Collectors.toList());
	}
	public static List<String> chngeInUpper(List<String>res){
		return res.stream().map(String::toUpperCase).collect(Collectors.toList());
	}

	public static void main(String[] args) {
		 List<Emp>emps=Arrays.asList(new Emp(11,"raghav",22000.4),new Emp(23,"Sumit",21100.4),new Emp(21,"Archit",25640.32),
					new Emp(65,"Anurag",32564.55),new Emp(54,"Hema",684855.33));
		 emps.stream().filter(Emp::salaryCheck).map(emp->{emp.setEsal(emp.getEsal()+10000); return emp;}).forEach(System.out::println);
       List<String>numbres=List.of("1","2","3","4","5");
       List<Integer>intNum=MethodRefMapEx.stringToIntNum(numbres);
       intNum.stream().forEach(System.out::print);
       System.out.println("**********");
       List<String>names=List.of("radha","rakesh","kamalendra","kaushalya","Keshav","Prakaaashaha");
       List<Integer>len=MethodRefMapEx.evalLength(names);
       len.stream().forEach(i->System.out.print(i+" "));
       List<String>upperName=MethodRefMapEx.chngeInUpper(names);
       System.out.print(upperName+" ");
       System.out.println("**********");
       List<Person>pp=List.of(new Person("Shubham",22),new Person("Nimmi",21));
       pp.stream().map(Person::newAge).forEach(i->System.out.print(i+" "));
	}

}

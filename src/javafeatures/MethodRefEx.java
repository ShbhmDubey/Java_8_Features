package javafeatures;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MethodRefEx {

	public static void main(String[] args) {
		List<String>res=List.of("Ram","Shyam","Raghu","Shahid","Shirley","Sakkshi","","");
		long val=res.stream().filter(str->str.isEmpty()).count();
       System.out.println("Count is "+val);
       res.stream().filter(str->str.length()>0).forEach(System.out::println);
       res.stream().map(str->str.concat(" Dubey")).forEach(System.out::println);
       long cnt=res.stream().filter(String::isEmpty).count();
       System.out.println(cnt);
       List<Emp>emps=Arrays.asList(new Emp(11,"raghav",22000.4),new Emp(23,"Sumit",21100.4),new Emp(21,"Archit",25640.32),
				new Emp(65,"Anurag",32564.55),new Emp(54,"Hema",684855.33));
       emps.stream().filter(Emp::salaryCheck).forEach(System.out::println);
       System.out.println("********");
       emps.stream().filter(Emp::nameCheck).forEach(System.out::println);
       List<Emp>ee=emps.stream().filter(Emp::nameCheck).collect(Collectors.toList());
       System.out.println("********");
       ee.forEach(System.out::println);
	
	}

}

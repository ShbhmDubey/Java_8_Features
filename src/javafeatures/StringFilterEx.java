package javafeatures;

import java.util.List;
import java.util.stream.Collectors;

public class StringFilterEx {

	public static void main(String[] args) {
		List<String>names=List.of("devi","raju","rani","krishna","raju","rani","dayam","king","queen");
       names.stream().filter(s->s.charAt(0)=='r').forEach(name->System.out.print(name+" "));
       System.out.println();
       names.stream().filter(s->s.charAt(0)=='r').filter(s->s.length()==4).forEach(name->System.out.print(name+" "));
       System.out.println();
       List<String>res=names.stream().filter(s->s.length()==4).collect(Collectors.toList());
	System.out.println(res);
	  long cnt=names.stream().filter(str->str.charAt(0)=='d').count();
	  System.out.println("Count is :"+cnt);
	  String fname=names.stream().filter(str->str.charAt(0)=='d').skip(1).findFirst().get();
	  System.out.println("First name is :"+fname);
	}

}

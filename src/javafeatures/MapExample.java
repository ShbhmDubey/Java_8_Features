package javafeatures;

import java.util.List;
import java.util.stream.Collectors;

public class MapExample {
	//map() used to perform operation in sequential manner on existing data
	public static void main(String[] args) {
		List<Integer>numbers=List.of(1,3,5,7,3,2,8,9,12,34,15,322,54,76,78,98);
		numbers.stream().map(i->i+2).forEach(num->System.out.print(num+" "));
		System.out.println();
		numbers.stream().map(i->i-10).forEach(val->System.out.print(val+" "));
		System.out.println();
		List<Integer>res=numbers.stream().map(val->val+5)
				.collect(Collectors.toList());
		System.out.println("list is :"+res);
		List<String>names=List.of("Jai Prakash","Guddi","Jyoti","Abhishek","Ujala","Shubham","Anya");
		names.stream().map(str->str.concat(" Dubey"))
		.forEach(ss->System.out.print(ss+" "));
		System.out.println();
long cnt=numbers.stream().filter(i->i%2!=0).map(num->num*10).count();
System.out.println("count is :"+cnt);
int num=numbers.stream().filter(i->i%2==0).findFirst().map(num1->11*num1).get();
System.out.println("first num is :"+num);
int num2= numbers.stream().filter(i->i%2==0).skip(2).map(val->val*3).findFirst().get();
System.out.println("Specific element is "+num2);
		

	}

}

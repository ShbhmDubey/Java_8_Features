package javafeatures;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FilterExample {

	public static void main(String[] args) {
		List<Integer>numbers=List.of(2,6,3,1,7,5,2,13,15,32,36,77);
		numbers.stream().filter(i->i%2==0).forEach(num->System.out.print(num+" "));
		System.out.println();
		numbers.stream().filter(i->i>10).forEach(val->System.out.print(val+" "));
		System.out.println();
		numbers.stream().filter(i->i>=10).filter(j->j%2!=0).forEach(val->System.out.print(val+" "));
    List<Integer>val1=numbers.stream().filter(num->num%2==0).collect(Collectors.toList());
	System.out.println(val1);
	
	List<Integer>val2=numbers.stream().filter(i->i>10).collect(Collectors.toList());
	System.out.println(val2);
	
	List<Integer>num3=numbers.stream().filter(i->i<=10).collect(Collectors.toList());
	Set<Integer>ss=numbers.stream().filter(i->i<=10).collect(Collectors.toSet());
	System.out.println("List is "+num3);
	System.out.println("Set is :"+ss);
	Long cnt=numbers.stream().filter(i->i%2==0).count();
	System.out.println(cnt+"->> Count of total even numbers");
	int key=numbers.stream().filter(i->i>30).findFirst().get();
	System.out.println("Finding first is :"+key);
	int kk=numbers.stream().filter(i->i%2==0).skip(4).findFirst().get();
	System.out.println("Specific vlue is :"+kk);
		
		
		
	}

}

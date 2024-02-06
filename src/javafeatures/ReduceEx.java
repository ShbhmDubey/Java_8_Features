package javafeatures;

import java.util.List;

public class ReduceEx {

	public static void main(String[] args) {
		List<Integer>numbers=List.of(2,4,6,12,43,2,12,1,7,8,34,56,89);
		int val=numbers.stream().filter(i->i>10).reduce((i,j)->i+j).get();
		System.out.println("Sum of all values is :"+val);
		int num2=numbers.stream().filter(i->i>10).map(i->i*10).reduce((i,j)->(i+j)).get();
        System.out.println("Weak elements sum is :"+num2);
	}

}

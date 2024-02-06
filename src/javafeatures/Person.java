package javafeatures;

public class Person {
   String name;
   int age;
public Person(String name, int age) {
	this.name = name;
	this.age = age;
}

public int newAge() {
	
	return this.age+2;
}
   
}

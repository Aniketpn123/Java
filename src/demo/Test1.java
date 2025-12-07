package demo;
//custom exception for invlaid name
class NameNotFoundException extends Exception{
	NameNotFoundException(String message){
		super(message);
	}
}

//custom exception for invalid salary

class InvalidSalaryException extends Exception{
	InvalidSalaryException(String message){
		super(message);
	}
}

class Employee1{
	String name;
	double salary;
	// constructor declares possible checked exception using 'throws'
	Employee1(String name,double salary) throws NameNotFoundException ,InvalidSalaryException{
		
		if(name == null) {
			//throw keyword explicitly throws the exception
			throw new NameNotFoundException("emp name cant not null");
		}
		if (salary < 0) {
			throw new InvalidSalaryExceptio n("slary cant be -ve");
		}
		this.name = name;
		this.salary= salary;
	}
	
	public String toString() {
		return "Employee{name=' "  + name + " ',salary = " +salary +"}";
	}
}

public class EmployeeThrowThrowsDemo{
	public static void main(String[] a) {
		try {
			//valid emp
			Employee e1 =new Employee1('supruia',50000);
			System.out.println(e1);
			
			Employee e1 =new Employee1('supruia',-50000);
			System.out.println(e1);
		}
		
		catch(NameNotFoundException | InvalidSalsryException e) {
			System.out.println("exception caught" + e.getMessage());
		}
	}
}


// static inner class


class Outer{
	 static class Inner{
		void show() {
			System.out.println("Hello from Static Inner Class!");
		}
	}
	 public static void main(String a[]) {
		 Outer.Inner inner  = new Outer.Inner();
		 inner.show(); 
	 }
}


//  static inner class accesses the static variable of the outer class:


class Outer{
	static class Inner{
		int number=100;
		void show() {
			 System.out.println("Outer class number = " + number);
		}
	}
	 public static void main(String a[]) {
		Outer.Inner inner = new Outer.Inner(); 
		inner.show();
	 }	
}



//Member Inner Class (Non-Static Inner Class)



class Outer{
	int number=50;
	class Inner{
		void show() {
			 System.out.println("Outer class number = " + number);
		}
	}
	 public static void main(String a[]) {
			Outer outer = new Outer();
			Outer.Inner inner = outer.new Inner();
			inner.show();
		 }	
}


//non-static inner class accesses a method of the outer class 👇


class Outer{
	 void outerMethod() {
	        System.out.println("This is Outer Method");
	    }
	class Inner{
		void show() {
			outerMethod();
			  System.out.println("This is Inner Method");
		}
	}
	 public static void main(String a[]) {
			Outer outer = new Outer();
			Outer.Inner inner = outer.new Inner();
			inner.show();
		 }	
}


//Anonymous Inner Class in Java


interface Animal{
	void sound();
}

class Test {
	public static void main(String a[]) {
		Animal dog = new Animal() {
			public void sound() {
				 System.out.println("Dog barks");
			}
		};
	     dog.sound();	
	}
}

////Anonymous  Class extending abstrac class

abstract class Animal{
	abstract void sound();
}
class Test {
	public static void main(String a[]) {
	       Animal dog = new Animal() {
	    	 void sound() {  
	    		 System.out.println("Dog barks");
	    	 }
	       };
	       dog.sound();
	}
}

// Fuctional Interface


interface MyFunction{
	void show();
}

public class Main
{
	public static void main(String a[]) {
		Myfunction fun = ()-> System.out.println("Hello Functional Interface!");
		fun.show();
	}
}


// interface with deafilt method

interface Myfunction{
	void sound();
	default void show() {;
	 System.out.println("Animal is sleeping...");
	}
}

class Dog implements Myfunction{
	public void sound() {
		 System.out.println("Dog barks!");
	}
}

public class Main
{
	public static void main(String a[]) {
		Dog g = new Dog();
		g.sound();
		g.show();
	}
}


// interface with static method


interface Myfunction{
	static void sleep(int x) {
		return x;
	}
}

public class Main
{
	public static void main(String a[]) {
	     int r= sleep(67);
	     System.out.println(r);
	}
}


//lambda wiht sinhle


interface Square{
	int calculate(int x);
}

public class Main
{
	public static void main(String a[]) {
	     Square sq = (x)-> x;
	     System.out.println(sq.calculate(5));
	}
}


//lambda wiht multiple

interface Add {
    int add(int a, int b);
}

public class Main {
    public static void main(String[] args) {
        Add obj = (a, b) -> a + b; // multiple parameters
        System.out.println(obj.add(5, 10));
    }
}





// SQL

//CREATE TABLE Students (
//	    id INT PRIMARY KEY,
//	    name VARCHAR(50) NOT NULL
//	);
//
//
//ALTER TABLE Students
//ADD CONSTRAINT unique_email UNIQUE(email);
//
//ALTER TABLE Students
//ADD CONSTRAINT check_age CHECK(age >= 18);
//
//
//CREATE TABLE Orders (
//	    order_id INT PRIMARY KEY,
//	    status VARCHAR(20) DEFAULT 'Pending'
//	);
//
//
//CREATE TABLE Department (
//	    dept_id INT PRIMARY KEY,
//	    dept_name VARCHAR(50)
//	);
//
//	CREATE TABLE Employee (
//	    emp_id INT PRIMARY KEY,
//	    emp_name VARCHAR(50),
//	    dept_id INT,
//	    FOREIGN KEY (dept_id) REFERENCES Department(dept_id)
//	);


/// built in functoin i terface
/// 
/// 
// import java.util.function.Consumer;
//	public class Main {
//		 public static void main(String[] args) {
//		       Consumr<String> d = s-> System.out.println(s);
//		       s.accept("hello cosndimer");
//		 }
//	}
//	

	
//	import java.util.*;
//	import java.util.function.Function;
//
//	public class Main {
//	    public static void main(String[] args) {
//	        List<Integer> numbers = Arrays.asList(2, 4, 6, 8);
//
//	        Function<Integer, Integer> square = x -> x * x;
//
//	        List<Integer> result = new ArrayList<>();
//
//	        for (Integer num : numbers) {
//	            result.add(square.apply(num));  // apply function to each element
//	        }
//
//	        System.out.println(result);
//	    }
//	}
//    import java.util.function.Consumer;
//    import java.util.*;
//    
//    public class Main{
//    	public static void main(String a[]) {
//    		List<Integer> l = Arrays.asList(10,20,30);
//    		Consumer<Integer> d = n-> System.out.println(n);
//    		
//    		l.forEach(d);
//    	}
//    }
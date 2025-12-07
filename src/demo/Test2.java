package demo;
import java.util.function.Supplier;
import java.util.Random;

public class Test2 {
   interface Operation{
	   int perform(int a , int b);
   }
   public static void main(String args[]) {
	   Operation add = (a,b)-> a+b;
	   Operation subtract =(a,b)-> a-b;
	   Operation multiply =(a,b)-> a*b;
	   System.out.println(add.perform(3, 5));
	   System.out.println(multiply.perform(3, 5));
	   
	   
	   //parent.accept();
   }
}




import java.util.Scanner;

public class GuessGame {
    public static void main(String[] args) {
        Random rand = new Random(); 
        int number = rand.nextInt(100) + 1; // 1 to 100
        int guess = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("I have selected a number between 1 to 100. Try to guess it!");

        while(guess != number) {
            System.out.print("Enter your guess: ");
            guess = sc.nextInt();

            if(guess > number) {
                System.out.println("Too High! Try Again.");
            } else if(guess < number) {
                System.out.println("Too Low! Try Again.");
            } else {
                System.out.println("🎉 Correct! The number was " + number);
            }
        }

        sc.close();
    }
}




import java.util.function.Supplier;

public class SupplierDemo {
    public static void main(String[] args) {
        Supplier<String> supplier = () -> "Hello, Aniket!";

        System.out.println(supplier.get());
    }
}




import java.util.function.Predicate;

public class PredicateDemo {
    public static void main(String[] args) {
//        Predicate<Integer> isEven = n -> n % 2 == 0;
//
//        System.out.println(isEven.test(10)); // true
//        System.out.println(isEven.test(7));  // false
    	
    	
    	
    }
}


import java.util.function.Supplier;
import java.util.Random;
public class SupplierDemo{
	public static void main(String a[]) {
		Supplier<Integer> randomNum = ()-> new Random().nextInt(100);
		 System.out.println(randomNum.get()); 
	}
}


import java.util.function.Supplier;
public class SupplierDemo{
	public static void main(String a[]) {
		String name= null;
		Supplier<Integer> defaultName= ()-> "Guest user";
		System.out.println("hello" +name != null ? name:defaultName.get(
		));
	}
}


import java.util.function.Predicate;
public class SupplierDemo{
	public static void main(String a[]) {
		Predicate<Integer> isEven = n-> n%2==0;
		 System.out.println(isEven.test(10)); 
	}
}


import java.uitl.function.Predicate;
import java.util.*;
public class PredicateDemo{
	public static void main(String a[]) {
		List<String> name = Arrays.asList("sgs","sgs","sgsgs");
		Predicate<String> startWith = s -> s.startsWith("A");
		names.stream().filter(startWith).forEach(System.out:: Println);
	}
}


import java.util.*;
import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.*;
public class PredicateDemo{
	public static void main(String a[]) {
		Function<String, Integer> strLength = s-> s.length();
		System.out.println(strLength.apply("hello"));
		
		Function<Integer,Integer> square= n->n*n;
		System.out.println(square.apply(2));
		
		ArrayList<Integer> num = new ArratList.asList(3,232,24,525,525);
		
		num.stream().filter(n->n%2==0).forEach(System.out::println);
		
		List<String> names =Arrays.asList("sgsg","fgsgs","sgsfg");
		
		List<String> upperNames= names.stream().map(s->s.toUpperCase()).collect(Collectors.toList());
		//String::tpUpperCase
		System.out.pritnln(uppeperNames);
		
	}
}

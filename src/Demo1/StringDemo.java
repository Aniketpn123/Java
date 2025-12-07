package Demo1;
import java.util.Arrays;
import java.util.ArrayList;

public class StringDemo {
	public static void main(String args[]) {
//	String name="aniekt";
//	String name2 ="aniket";
//	String name3=name;
//	System.out.println(name==name3);
//	 name="ani";
//	System.out.println(name == name );
//	/// comparisonin
//	String a= new String("ani");
//	String b= new String("ani");
//	System.out.println(a==b );
	
	//methods
		
//	String name1= "aniket";
//	String name2="aniket";
//	System.out.println(name1.equals(name2));
//	System.out.println(name1.charAt(2));
		
	//output
//		Integer num = new Integer(34);
//		System.out.println(num.toString());
//		
//		System.out.println("5");
//		System.out.println(Arrays.toString(new int[] {1324,2,54,345}));
//		String name =null;
//		System.out.println(name);
		
		//float a =53.3636f;
		//System.out.printf("%.2f",a);
	//	System.out.printf("%.3f",Math.PI);
		//System.out.printf("%s and %s","aniket","ani");
		
		// Opeartors
		
//		System.out.println('a'+'b');
//		System.out.println("a"+"b");
//		System.out.println((char)('a'+ 3));
//		System.out.println("knal"+ new ArrayList<>());
//		System.out.println("f"+new Integer(56));
//		System.out.println(new ArrayList<>() + " "+new Integer(56));
		
		//Performance
		
//		String series ="";
//		for(int i=0; i<5;i++) {
//			char ch =(char)('a'+ i);
//			series+= ch;
//		}
//		System.out.println(series);
		
		//		String BUILDER ...................>
		
//		StringBuilder builder = new StringBuilder();
//		for(int i=0;i<9;i++) {
//			char ch = (char)('a'+ i);
//			builder.append(ch).reverse();
//		}
//		System.out.println(builder);
//		System.out.println(builder.deleteCharAt(0));
//		System.out.println(builder.reverse());
		
		//methods
//		String name ="aniket nakafye";
//		System.out.println(Arrays.toString(name.toCharArray()));
//		System.out.println(name.indexOf('n'));
//		System.out.println(Arrays.toString(name.split(" ")));
//		System.out.println("   ani   ".strip());
//		System.out.println("   ani   ".trim());
		
		//palindrom
		String str = "aba";
		String rev="";
		for(int i= str.length()-1;i>=0;i--) {
			rev += str.charAt(i);
		}
		
		if(str.equals(rev)) {
			System.out.println("is");
		}
		else {
			System.out.println("not");
		}
		
}
}

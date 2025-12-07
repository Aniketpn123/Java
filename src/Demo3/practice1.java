package Demo3;
import java.util.Arrays;
import java.util.Scanner;

public class practice1 {
	
	static double[] Areas(int r,int b,int h,int l,int side) {
		double areaOfCircle = Math.round(Math.PI*r*r);
		double areaOfTriangle =Math.round(0.5 * b * h) ;
		double areaOfParalellogram =Math.round( b * h) ;
		double areaOfRhombus =Math.round( side * h) ;
		double areaOfReactangle =Math.round(l* b) ;
//		String areaOfTriangle =String.format( "%.2f" ,0.5 * b * h) ;
		return  new double[] {areaOfCircle,areaOfTriangle,areaOfReactangle,areaOfParalellogram,areaOfRhombus};
	}
	
	
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
//1. Palindrom		
	
//	String st=sc.nextLine();
//	int no = sc.nextInt();
//	int start=0;
//	int end = st.length()-1;
//	int rev=0;
//    //st = Integer.toString(no);
//	boolean palindrom=true;
//
//	while(start<end  && no >0) {
//		int r= no%10;
//		rev= rev*10+r;
//		no =no/10;
//		if(st.charAt(start) != st.charAt(end)) {
//			palindrom= false;
//			break;
//		}
//		start++;
//		end--;
//	}
//	
//	if(palindrom == true || no == rev) {
//		System.out.println( st +"& "+no+"is Palindrom");
//	}
//	else {
//		System.out.println( st +"& "+no+"is not Palindrom");
//	}
	
	
	
	// 2. armstrong
//	  int no =sc.nextInt();
//	  int temp =no;
//	  int sum=0;
//	  int digit=0;
//	 int n=no;
//	  while( n >0 ) {
//		  digit++;
//		  n/=10;
//	  }
//	  
//	  n=no;
//	  while (no >0) {
//		  int i= no%10;
//		  int power=1;
//		  for(int r=0; r<digit;r++) {
//			 power*=i; 
//		  }
//		  sum+= power;
//		  no/=10;
//	  }
//	  
//	  if(sum == temp) {
//		  System.out.println("yes it is");
//	  }
//	  else {
//		  System.out.println("it is not");
//	  }
//
      
//	3. Area of 

//		int r= sc.nextInt();
//		int b= sc.nextInt();
//		int h= sc.nextInt();
//		int l= sc.nextInt();
//		int side= sc.nextInt();
//		double[]result =Areas(r,b,h,l,side);
//		System.out.println(Arrays.toString(result));
		
		
		
		
	//	3.fibonacii......
//	int a= sc.nextInt();
//	int b=sc.nextInt();
//		while(a<50) {
//			int i = a+b;
//			System.out.print(a+" ");
//			a= b;
//			b = i;
//		}
//		
		
		// 4. factors of no
		
//		int no = sc.nextInt();
//		
//		for(int i=1; i <=no; i++) {
//			if (no % i == 0) {
//				System.out.println(i);
//			}
//		}
		
		
		// 5/ sum till enter 0
		
//		int no =1;
//		int sum=0;
//		System.out.println("put any no if  put 0 i will give its sum");
//		while(no !=0) {
//
//			no= sc.nextInt();
//			sum +=no;
//		}
//		System.out.println(sum);
		
		// 6. max no.
//		
//		int no =1;
//		int max=0;
//		System.out.println("put any no if  put 0 i will give  max");
//		while(no !=0) {
//			no= sc.nextInt();
//			if(no > max) {
//				max=no;
//			}
//		}
//		System.out.println(max);
		
		
//		7. factorial of no
//		int no= sc.nextInt();
//		int fact=1;
//		for(int i=1;i<=no;i++) {
//			 fact *=  i;
//		}
//		System.out.println(fact);
		
		
		
//		8. bill gets
		
//		
//		   System.out.print("Enter units consumed: ");
//	        int units = sc.nextInt();
//
//	        double rate = 7.50;
//	        double bill = units * rate;
//
//	        System.out.println("Your Total Electricity Bill: ₹" + bill);
//	
		
		//9/ avg of n
//		int no=1;
//		int sum=0;
//		int avg=0;
//		int count=0;
//		   System.out.print("Enter no: ");
//			while(no!=0) {
//	
//		         no = sc.nextInt();
//		         if(no!=0) {
//		        sum+= no;
//		        count++;
//		         }
//			}
//		    avg =sum/count;
//		        System.out.println("Your avg "+ avg);
		
		
		//10.  discout on product
		
//		double price = sc.nextDouble();
//		double dis=sc.nextDouble();
//		if( price >1000 ){
//			double disPrice= (price*dis)/100;
//			double finalPrice = price - disPrice;
//			System.out.printf("%.2f",finalPrice);
//		}
//		else {
//			System.out.print("no disc");
//			System.out.println("Invalid input! Please enter numbers only.");
//		}
		
		//11. distance btewween points
		
//		   System.out.print("Enter x1: ");
//	        double x1 = sc.nextDouble();
//	        System.out.print("Enter y1: ");
//	        double y1 = sc.nextDouble();
//
//	        System.out.print("Enter x2: ");
//	        double x2 = sc.nextDouble();
//	        System.out.print("Enter y2: ");
//	        double y2 = sc.nextDouble();
//	        
//	        double dis = Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
//	        System.out.print(dis);
		
		//12. commsion percentage
		
//		double sell =sc.nextDouble();
//		double commision = sc.nextDouble();
//		
//		if (sell > 10000) {
//			double commisionPer = (commision/sell)*100;
//			 System.out.printf("Commission Percentage: %.2f%%", commisionPer);
//		}

//		14. Power in java
//		
//		int base = sc.nextInt();
//		int expo= sc.nextInt();
//		
//		double rootOf =  Math.pow(base,expo);
//		 System.out.printf("%.2f",rootOf);
		
		//15. depression value
		
		
//		  double price = sc.nextDouble();
//		  double salvage = sc.nextDouble();
//		  int life =sc.nextInt();
//		
//		  double depreciationPerYr =  (price-salvage)/life;
//		  System.out.printf("%.2f", depreciationPerYr);
		
		
		//16. Batting avg
		
//		  int runs = sc.nextInt();
//		  int out =sc.nextInt();
//		
//		  double avg =  runs/out;
//		  System.out.printf("%.2f", avg);
		sc.close();
}
}

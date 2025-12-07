package practice;

import java.util.Arrays;
import java.util.Scanner;

public class PracticeArray {

	public static void main(String[] args) {
		
//		int []no= {45,656,536,63,636,56,5};
//		
//		int[] no2 = new int[5]; 
//		
//		int no3[];
//		no3= new int[7];
//		
//		int[] no4 = {426,624,624,6,26,62,6,6,42};
//				
//		System.out.println(no4[0]);
//		System.out.println(no3[0]); 
		
//		int[] arr = new int[5];
		
//		for( int i=0; i< arr.length; i++) {
//			arr[i]= sc.nextInt();
//			System.out.println(arr[i]);
//		}
		
//		for(int num : arr) {
//			num= sc.nextInt();
//			System.out.println(num);
//		}
//		System.out.println(Arrays.toString(arr));
		
		Scanner sc= new Scanner(System.in);
		
		String[] st = new String[5];
		
		for(int i=0 ; i<st.length;i++) {
			st[i]= sc.next();
		}
		System.out.println(Arrays.toString(st));
		
		sc.close();

	}
		
	}


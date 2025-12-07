package Demo1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
public class Swap {
	  static void swap(int[] arr,int index1,int index2) {
		   int temp= arr[index1];
		   arr[index1]=arr[index2];
		   arr[index2]=temp;
	   }
	  	
	   static void change(int[] arr) {
		   arr[0]=99;
	   }
	   
	   static int max(int[] arr,int start,int end) {
		   int maxVal=arr[0];// Integer.MIN.VALUE;
		   for (int i=start;i<arr[end];i++) {
			   if (maxVal < arr[i]) {
				   maxVal= arr[i];
			   }
		   }
		   return maxVal;
	   }
	   
	   static void reverse(int arr[] ,int start,int end) {
//		   for(int i=start;i<arr[end];i++) {
//			   int temp = arr[i];
//			   arr[arr.length-i]=arr[i];
//			   arr[i]=temp;
//		   }
//		   System.out.println(Arrays.toString(arr));
		   int start=0;
		   int end = arr.length-1;
		   
		   while (start<end) {
			   swap(arr,start,end);
			   start++;
			   end--;
			     
		   }
	   }
	   
   public static void main(String a[]) {
//	  int nums[]= {23,545,25,5,54,34};
//	  int nums1[][]= new int[3][];
//	  int nums2[][]= {{2,4,5,6},{5,6},{4,6}};
//	  System.out.println(Arrays.toString(nums));
//	  change(nums);
//	  System.out.println(Arrays.toString(nums));
	   
	   
	  Scanner sc = new Scanner(System.in);
//	  int arr[][]= new int[3][3];
//	  for(int i=0 ; i< arr.length;i++) {
//		  for(int j=0 ; j< arr[i].length;j++) {
//			  arr[i][j]= sc.nextInt();
//		  }
//	  }
//	  for(int i=0 ; i< arr.length;i++) {
//		  for(int j=0 ; j< arr[i].length;j++) {
//			  System.out.print(arr[i][j]+ " ");
//		  }
//		  System.out.println();
//	  }
	  
//	  for(int i=0 ; i < arr.length ; i++) {
//		  System.out.println(Arrays.toString(arr[i]));
//	  }
	  
//	  int[][] arr = {
//			  {144,34,1,41,4,14},
//			  {32,41,4,415646,636},
//			  {2,32,423,5,5}
//	  };
//	  
//	  for (int i =0 ; i<arr.length; i++) {
//		  for (int j=0 ; j < arr[i].length;j++) {
//			  System.out.print(arr[i][j]+" ");
//		  }
//		  System.out.println( );
//	  }
	  
//	     ArrayList<Integer> list = new ArrayList<>();
	  
//	     list.add(34);
//	     list.add(344);
//	     
//	     System.out.println(list);
//	     list.set(0, 33);
//	     
//	     list.remove(1);
	     
//	     System.out.println(list);
	     
//	     for(int i=0; i < 5;i++) {
//	    	 list.add(sc.nextInt());
//	     }
//	     
//	     System.out.println(list);
//	  
//sc.close();

//	     ArrayList<ArrayList<Integer>> list = new ArrayList<>();
//	     
//	     for(int i=0 ; i<5;i++) {
//	    	 list.add(new ArrayList<>());
//	     }
//
//	     for(int i=0 ; i<5;i++) {
//	    	 for(int j=0 ; j<5;j++) {
//		    	 list.get(i).add(sc.nextInt());
//		     }
//
//	     }
//
//	     System.out.println(list);
//   }
	  
//	  int[]arr= {34,245,2,5,25};
//	  swap(arr,1,3);  
//	  
  int []arr = {1,4,34,14,1,4,14};
//	  System.out.println(max(arr,2,4));
reverse(arr) ;
}
 
   
   
}


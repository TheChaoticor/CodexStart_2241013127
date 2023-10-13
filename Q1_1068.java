

import java.util.Scanner;

public class Q1_1068 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);S
		long n=sc.nextLong();
		System.out.print(num(n) + " ");
		

	}
	
	 static long num(long n) {
		 if(n==1) {
			 return 1;
		 }
		
	 else if(n%2==0) {
				 System.out.print(n + " ");
				 return num(n/2);
			 }
			 else  {
				 System.out.print(n+ " ");
				 return num(n*3+1);
			 }
			
		 }
		
	

}

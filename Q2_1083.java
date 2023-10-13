import java.util.Scanner;

public class Q2_1083 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

                  Scanner sc=new Scanner(System.in);
		long n=sc.nextLong();
		long sumall=(n*(n+1))/2;
		long sum=0;
		for(int i=0;i<n-1;i++) {
			long m=sc.nextLong();
			sum+=m;
		}
		System.out.println(sumall-sum);

	}

}

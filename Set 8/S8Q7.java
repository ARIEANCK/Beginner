package set8;

import java.util.Scanner;

public class S8Q7 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int d=s.nextInt();
//		for(int i=2;i<=d;i++)
//			if(isPrime(i)) System.out.println(i);
		for(int i=1;i<=d;i++)
		{
			if(d%i==0) System.out.print(i+" ");
		}
		s.close();
		
	}
}

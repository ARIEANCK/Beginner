package set4;

import java.util.Scanner;

public class Fib {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt(),f=0,a=0,b=1;
		System.out.print(b+" ");
		for(int i=1;i<n;i++)
		{
			f=a+b;
			System.out.print(f+" ");
			a=b;
			b=f;
		}
		in.close();
	}

}

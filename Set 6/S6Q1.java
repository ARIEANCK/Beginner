package set6;

import java.util.Scanner;

public class S6Q1 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int a=in.nextInt(),f=0,r=0,n=a,t=0;
		while(n!=0) {
			f++;
			n/=10;
		}
		int a1[]=new int[f];
		while(a!=0) {
			r=a%10;
			a1[t]=r;t++;
			a/=10;
		}
		for(int i=f-1;i>=0;i--)
		System.out.print(a1[i]+" ");
		in.close();
	}

}

package set2;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt(),f=0;
		for(int i=2;i<n/2;i++)
		{
			if(n%i==0) f=1;
		}
		if(f==0) System.out.println("Yes");
		else System.out.println("No");
	}

}

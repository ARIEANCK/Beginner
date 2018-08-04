package set5;

import java.util.Arrays;
import java.util.Scanner;

public class MinMax {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt(),a[]=new int[n];
		for(int i=0;i<n;i++)
		 a[i]=in.nextInt();
		Arrays.sort(a);
		System.out.println(a[0]+" "+a[n-1]);
		in.close();
	}

}

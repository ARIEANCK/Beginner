package set4;

import java.util.Arrays;
import java.util.Scanner;
public class Max {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int a[]=new int[10];
		for(int i=0;i<9;i++)
		 a[i]=in.nextInt();
		Arrays.sort(a);
		System.out.println(a[9]);
		in.close();
	}
}

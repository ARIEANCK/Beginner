package set7;

import java.util.Arrays;
import java.util.Scanner;

public class S7Q3 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int a[]=new int[10];
		for(int i=0;i<10;i++)
		 a[i]=in.nextInt();
		Arrays.sort(a);
		System.out.println(a[0]);
		in.close();
	}

}

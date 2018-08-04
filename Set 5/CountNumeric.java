package set5;

import java.util.Scanner;
public class CountNumeric {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int a=in.nextInt(),f=0;
		while(a!=0) {
			a/=10;
			f++;
		}
		System.out.println(f);
		in.close();
	}
}

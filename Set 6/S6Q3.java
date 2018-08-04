package set6;

import java.util.Scanner;

public class S6Q3 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int a=in.nextInt(),f=0,r=0;
		while(a!=0) {
			r=a%10;
			f+=r;
			a/=10;
		}
		System.out.println(f);
		in.close();
	}

}

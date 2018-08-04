package set3;

import java.util.Scanner;
public class MinToHrs {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt(),h=0,m=0;
		h=n/60;
		m=n%60;
		System.out.println(h+" "+m);
		in.close();
	}
}

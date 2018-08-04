package set5;

import java.util.Scanner;

public class Avg {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt(),avg=0;
		for(int i=0;i<n;i++) {avg+=in.nextInt();}
		System.out.println(avg/n);
		in.close();
	}

}

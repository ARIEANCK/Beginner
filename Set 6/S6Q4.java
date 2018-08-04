package set6;

import java.util.Scanner;

public class S6Q4 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		if(n%2==0)System.out.println(n);
		else System.out.println(n-1);
		in.close();
	}

}

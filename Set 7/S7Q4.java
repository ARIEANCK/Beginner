package set7;

import java.util.Arrays;
import java.util.Scanner;

public class S7Q4 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt(),m=in.nextInt();
		if((n+m)%2==0)
		System.out.println("Even");
		else System.out.println("Odd");
		in.close();
	}

}

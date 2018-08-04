package set6;

import java.util.Scanner;

public class S6Q2 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int a=in.nextInt();
		String num[]= {"One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten"};
		System.out.println(num[a-1]);
		in.close();
	}

}

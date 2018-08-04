package set7;

import java.util.Scanner;
public class S7Q1 {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String s1=in.next();int k=in.nextInt();
		System.out.println(s1.substring(0, k));
		in.close();
	}

}

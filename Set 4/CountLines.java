package set4;

import java.util.Scanner;
public class CountLines {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String s=in.nextLine();
		String[] s1=s.split("\\.");
		System.out.println(s1.length);
		in.close();
	}
}

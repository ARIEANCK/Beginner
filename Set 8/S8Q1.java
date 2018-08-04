package set8;

import java.util.Scanner;

public class S8Q1 {
public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	String s=in.next(),sb=new StringBuilder(s).reverse().toString();
	if(s.equals(sb))
	System.out.println("Yes");
	else System.out.println("No");
	in.close();
}
}

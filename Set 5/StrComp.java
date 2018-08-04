package set5;

import java.util.Scanner;

public class StrComp {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String s1=in.next(),s2=in.next();
		if(s2.length()>s1.length())
		System.out.println(s2);
		else
			System.out.println(s1);
		in.close();
	}

}

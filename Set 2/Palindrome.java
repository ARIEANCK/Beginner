package set2;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int org=in.nextInt(),r=1;
		String pal="",or=String.valueOf(org);
		while(org!=0)
		{
			r=org%10;
			org/=10;
			if(r!=0)
			pal+=""+r;
		}
		if(pal.equals(or))
		System.out.println("Yes");
		else
			System.out.println("No");
	}

}

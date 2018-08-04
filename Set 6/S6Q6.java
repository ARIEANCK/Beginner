package set6;

import java.util.Scanner;

public class S6Q6 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String s=in.nextLine();int l=0,m=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)>=65 && s.charAt(i)<=90 || s.charAt(i)>=97 && s.charAt(i)<=122)
				l=1;
			if(s.charAt(i)>=48 && s.charAt(i)<=57) m=1;
		}
		if(l==1 && m==1)
		System.out.println("Yes");
		else
			System.out.println("No");
		in.close();
	}

}

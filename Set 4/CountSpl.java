package set4;

import java.util.Scanner;

public class CountSpl {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String s=in.nextLine();int l=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)>=33 && s.charAt(i)<=47 || s.charAt(i)>=58 && s.charAt(i)<=64 || s.charAt(i)>=91 && s.charAt(i)<=96 || s.charAt(i)>=123 && s.charAt(i)<=126)
				l++;
		}
		System.out.println(l);
		in.close();
	}

}

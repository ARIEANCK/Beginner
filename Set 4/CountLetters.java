package set4;

import java.util.Scanner;

public class CountLetters {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String s=in.nextLine();int l=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)==' ')
				continue;
			else
				l++;
		}
		System.out.println(l);
		in.close();
	}

}

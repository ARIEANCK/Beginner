package set7;

import java.util.Scanner;

public class S7Q2 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String s1=in.next();int f=1;
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)=='0' || s1.charAt(i)=='1')
				f=0;
			else {
				f=1;break;
			}
		}
		if(f==0)
		System.out.println("Yes");
		else System.out.println("No");
		in.close();
	}

}

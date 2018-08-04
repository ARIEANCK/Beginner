package set8;

import java.util.Scanner;

public class S8Q2 {
public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	String s=in.next(),vw="aeiou";
	int t=0;
	for(int i=0;i<s.length();i++)
	{
		if(vw.indexOf(s.charAt(i))>=0)
		t=1;
	}
	if(t==1)System.out.println("Yes");
	else System.out.println("No");
	in.close();
}
}

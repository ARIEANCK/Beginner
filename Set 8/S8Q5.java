package set8;

import java.util.Scanner;

public class S8Q5 {
public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	String ss,s=in.next(),s1,s2=s.substring(s.length()/2+1,s.length());
	if(s.length()%2==0) {
		s1=s.substring(0,s.length()/2-1);
		ss=s1+"**"+s2;
	}
	else {
		s1=s.substring(0,s.length()/2);
		ss=s1+"*"+s2;
	}
	System.out.println(ss);
	in.close();
}
}

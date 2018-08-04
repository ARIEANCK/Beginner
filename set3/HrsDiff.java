package set3;

import java.util.Scanner;
public class HrsDiff {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int h=0,m=0,n1=0,n2=0,h1=in.nextInt(),m1=in.nextInt(),h2=in.nextInt(),m2=in.nextInt();
		n1=h1*60+m1;n2=h2*60+m2;
		if(n1>n2)
			n1=n1-n2;
		else
			n1=n2-n1;
		h=n1/60;
		m=n1%60;
		System.out.println(h+" "+m);
		in.close();
	}
}

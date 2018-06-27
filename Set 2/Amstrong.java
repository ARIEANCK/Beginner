package set2;

import java.util.Scanner;

public class Amstrong {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int org=in.nextInt(),ams=0,r=1,dub=org,pw=String.valueOf(org).length();
		while(org!=0)
		{
			r=org%10;
			org/=10;
			ams+=Math.pow(r, pw);
		}
		if(dub==ams || (dub<10 && dub>0))
		System.out.println("Yes");
		else
			System.out.println("No");
	}
}

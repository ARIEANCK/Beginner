package set8;

import java.util.Scanner;

public class S8Q9 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int d=s.nextInt(),n=s.nextInt();
		if(isPerfSqr(d*n)) System.out.println("Yes");
		else System.out.println("No");
		s.close();
	}
	static boolean isPerfSqr(int a)
	{
		boolean rt=false;
		for(int i=1;i<a/2;i++)
		{
			if(i*i==a) {rt=true;break;}
		}
		return rt;
	}
}

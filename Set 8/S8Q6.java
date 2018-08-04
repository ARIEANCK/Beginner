package set8;

import java.util.Scanner;

public class S8Q6 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int d=s.nextInt();
//		for(int i=2;i<=d;i++)
//			if(isPrime(i)) System.out.println(i);
		if(isComposite(d)) System.out.println("Yes");
		else System.out.println("No");
		s.close();
	}
	static boolean isComposite(int a)
	{
		boolean rt=false;
		for(int i=2;i<a;i++)
		{
			if(a%i==0) rt=true;
		}
		return rt;
	}
}

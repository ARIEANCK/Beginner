package set7;

import java.util.Scanner;

public class S7Q6 {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int d=s.nextInt();
//	for(int i=2;i<=d;i++)
//		if(isPrime(i)) System.out.println(i);
	if(isPrime(d)) System.out.println("Yes");
	else System.out.println("No");
	s.close();
}
static boolean isPrime(int a)
{
	boolean rt=true;
	for(int i=2;i<a;i++)
	{
		if(a%i==0) rt=false;
	}
	return rt;
}
}

package set5;

import java.util.Scanner;
public class CheckPow2 {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt(),t=0;
		while(n!=0)
		{
			if(n==2) { t=0; break;}
			if(n%2==1) {t=1;break;}
			n/=2;
		}
		if(t==1) System.out.println("No");
		else System.out.println("Yes");
		in.close();
	}

}

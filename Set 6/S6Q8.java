package set6;

import java.util.Scanner;

public class S6Q8 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt(),k=in.nextInt(),f=0,num[]= new int[n];
		for(int i=0;i<n;i++) num[i]=in.nextInt();
		for(int i=0;i<n;i++)
		{
			if(num[i]==k)f=1;
		}
		if(f==1)System.out.println("Yes");
		else System.out.println("No");
		in.close();
	}

}

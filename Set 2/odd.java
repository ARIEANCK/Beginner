package set2;

import java.util.Scanner;

public class odd {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt(),q=in.nextInt();
		for(int i=n+1;i<=q;i++)
		{
			if(i%2!=0) System.out.println(i);
		}
	}

}

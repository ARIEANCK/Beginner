package set6;

import java.util.Scanner;

public class S6Q10 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int k=in.nextInt(),f=0;
		for(int i=1;i<=k;i++)
		{
			f+=i;
		}
	    System.out.println(f);
	
		in.close();
	}

}

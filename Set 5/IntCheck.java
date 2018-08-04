package set5;

import java.util.Scanner;

public class IntCheck {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int a=in.nextInt(),f=0,num[]= {1,2,3,4,5,6,7,8,9,10};
		for(int i=0;i<10;i++) {if(num[i]==a)f=1;}
		if(f==1)System.out.println("Yes");
		else System.out.println("No");
		in.close();
	}

}

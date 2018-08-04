package set7;

import java.util.Scanner;

public class S7Q8 {
public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	int n=in.nextInt();
	if(n%7==0)
	System.out.println("Yes");
	else
		System.out.println("No");
	in.close();
}
}

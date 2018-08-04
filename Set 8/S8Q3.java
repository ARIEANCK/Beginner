package set8;

import java.util.Scanner;

public class S8Q3 {
public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	int n=in.nextInt(),l=in.nextInt(),r=in.nextInt();
	if(n>=l && n<=r)System.out.println("Yes");
	else System.out.println("No");
	in.close();
}
}

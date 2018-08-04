package set8;

import java.util.Scanner;

public class S8Q8 {
public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	int d=in.nextInt();
	if(d%13==0) System.out.println("Yes");
	else System.out.println("No");
	in.close();
}
}

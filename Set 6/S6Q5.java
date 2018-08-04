package set6;

import java.util.Scanner;

public class S6Q5 {
public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	int n=in.nextInt(),k=in.nextInt();
	if(n%2==0||k%2==0)System.out.println("Even");
	else System.out.println("Odd");
	in.close();
}
}

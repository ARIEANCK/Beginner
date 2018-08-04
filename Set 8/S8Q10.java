package set8;

import java.util.Scanner;

public class S8Q10 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String d=s.next();
		for(int i=0;i<d.length();i++)
		if(i%2!=0) System.out.print(d.charAt(i)+" ");
		s.close();
	}
}

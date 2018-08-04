package set3;

import java.util.Scanner;
public class StrValid {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		try
		{
			int s=in.nextInt();
			System.out.println("Yes");
			in.close();
		}
		catch(Exception e)
		{
			System.out.println("No");
		}
	}

}

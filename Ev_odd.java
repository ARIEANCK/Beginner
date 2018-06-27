import java.util.Scanner;
public class Ev_odd {
	public static void main(String[] args) {
	    Scanner in=new Scanner(System.in);
	    int N=0;
		try 
		{
			N = in.nextInt();
			if(N%2==0)
			System.out.println("Even");
			else
			System.out.println("Odd");
		} 
		catch (Exception e) 
		{
			System.out.println("Invalid Input");
		}
	}
}

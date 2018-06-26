import java.util.Scanner;
public class Pos_neg {
	public static void main(String[] args) {
	    Scanner in=new Scanner(System.in);
	    int N=0;
		try 
		{
			N = in.nextInt();
			if(N>0)
			System.out.println("Postive");
			else if(N<0)
			System.out.println("Negative");
			else
			System.out.println("Zero");
		} 
		catch (Exception e) 
		{
			System.out.println("Invalid Input");
		}
	}
}

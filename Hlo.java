import java.util.Scanner;
public class Hlo {
	public static void main(String[] args) {
	    Scanner in=new Scanner(System.in);
	    int N=0;
		try 
		{
			N = in.nextInt();
			for(int i=0;i<N;i++)
			    System.out.println("Hello");
		} 
		catch (Exception e) 
		{
			System.out.println("Invalid Input");
		}
	}
}

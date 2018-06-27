import java.util.Scanner;
public class Leap {
	public static void main(String[] args) {
	    Scanner in=new Scanner(System.in);
	    int N=0;
		try 
		{
			N = in.nextInt();
			if(N%4==0 && N%400!=0)
		        System.out.println("Yes");
		    else
		        System.out.println("No");
		} 
		catch (Exception e) 
		{
			System.out.println("Invalid Input");
		}
	}
}

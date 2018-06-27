import java.util.Scanner;
public class Largnum {
	public static void main(String[] args) {
	    Scanner in=new Scanner(System.in);
	    int N=0,max=-999;
		try 
		{
		    for(int i=0;i<3;i++)
		    {
			N = in.nextInt();
			if(max<N)
			    max=N;
		    }
		    System.out.println(max);
		} 
		catch (Exception e) 
		{
			System.out.println("Invalid Input");
		}
	}
}

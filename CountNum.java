import java.util.Scanner;
public class CountNum {
	public static void main(String[] args) {
	    Scanner in=new Scanner(System.in);
	    int N=0,r=1,c=0;
		try 
		{
			N = in.nextInt();
			while(r!=0)
			{
			    N/=10;
			    r=N%10;
			    c++;
			}
			System.out.println(c);
		} 
		catch (Exception e) 
		{
			System.out.println("Invalid Input");
		}
	}
}

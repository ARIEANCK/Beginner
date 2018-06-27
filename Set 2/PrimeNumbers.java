import java.util.Scanner;
public class PrimeNumbers {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt(),q=in.nextInt(),f=0;
		for(int i=n;i<=q;i++)
		{
			f=0;
			for(int j=2;j<=i/2;j++)
			{
				if(i%j==0) f=1;
			}
			if(f==0) System.out.println(i);
		}
	}
}

import java.util.Scanner;
public class ArithProg {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter No.of terms and Starting number and Difference");
		int n=in.nextInt(),a=in.nextInt(),d=in.nextInt(),f=0;
		for(int i=0;i<n;i++)
		{
			f+=a;
			a+=d;
		}
		System.out.println(f);
		in.close();
	}
}

import java.util.Scanner;
public class Pow {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n=in.nextInt(),p=in.nextInt(),r=1;
		for(int i=0;i<p;i++)
			r*=n;
		System.out.println(r);
	}
}

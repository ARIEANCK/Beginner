package set7;
import java.util.Scanner;
public class S7Q7 {
public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	int n=in.nextInt(),m;
	m=10-(n%10);
	System.out.println(n+m);
	in.close();
}
}

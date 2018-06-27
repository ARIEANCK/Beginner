import java.util.Scanner;
public class Alp {
	public static void main(String[] args) {
	    Scanner in=new Scanner(System.in);
	    String vow="aeiou";
	    char N;
	    N = in.next().charAt(0);
	    int t=N;
	    if(t>=65 && t<=90 || t>=97 && t<=122)
	        System.out.println("Alphabet");
	    else
	        System.out.println("No");
	}
}

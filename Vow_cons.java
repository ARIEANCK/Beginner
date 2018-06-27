import java.util.Scanner;
public class Vow_Cons {
	public static void main(String[] args) {
	    Scanner in=new Scanner(System.in);
	    String vow="aeiou";
	    char N;
	    int f=0;
	    N = in.next().charAt(0);
			for(int i=0;i<vow.length();i++)
			{
			    if(vow.charAt(i)==N)
			     {   
			         System.out.println("Vowel");
			         break;
			     }  
			    else
			         f=1;
			}
		if(f==1)
		    System.out.println("Consonant");
	}
}

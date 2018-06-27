import java.util.Scanner;
public class Addarr {
	public static void main(String[] args) {
	    Scanner in=new Scanner(System.in);
	    int N = in.nextInt(),K=in.nextInt(),tot=0;
	    int ar[]=new int[N];
		for(int i=0;i<N;i++)
		    {
		        ar[i]=in.nextInt();
		        if(i<K)
		         tot+=ar[i];
		    }
		System.out.println(tot);
	}
}

import java.util.Scanner;
public class AmsNum {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt(),ams=0,r=1,dub=n,pw=0,q=in.nextInt(),f=0;
		for(int i=dub;i<=q;i++)
		{
			f=i;ams=0;
			pw=String.valueOf(f).length();
			while(f!=0)
			{
				r=f%10;
				f/=10;
				ams+=Math.pow(r, pw);
			}
			if(i==ams || (i<10 && i>0))
			System.out.println(ams);
		}
	}
}

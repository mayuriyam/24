
import java.util.Scanner;

public class reverse {
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	 int a=sc.nextInt();
	String s=Integer.toString(a);
	int x=0;
	for(int i=0;i<s.length();i++)
	{
		int temp=a%10;
		a=a/10;
		x=x*10+temp;
	}
	System.out.println(x);
sc.close();
}
}

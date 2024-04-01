package p4;
import java.util.*;

public class sortString 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter String : ");
		String str=sc.nextLine();
		char c[]=str.toCharArray();
		Arrays.sort(c);
		System.out.print("Sorted String : ");
		System.out.println(c);
	}

}

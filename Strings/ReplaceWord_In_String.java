package p1;
import java.util.*;

public class ReplaceString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("String : ");
		String str=sc.nextLine();
		System.out.print("Word : ");
		String str3=sc.next();
		System.out.print("Replace Word : ");
		String str4=sc.next();
		String[] str2=str.split("\\s");
		for(int i=0;i<str2.length;i++)
		{
			if(str2[i].equals(str3)) {
				str2[i]=str4;
			}
		}
		for(int i=0;i<str2.length;i++) {
			System.out.print(str2[i]+" ");
		}
	}
}

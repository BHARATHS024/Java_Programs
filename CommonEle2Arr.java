package p2;
import java.util.*;

public class CommonEle2Arr {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of Elements : ");
		int a=sc.nextInt();
		int[] arr1=new int[a];
		System.out.println("Enter the Elements of Array 1 : ");
		for(int i=0;i<a;i++)
		{
			arr1[i]=sc.nextInt();
		}
		System.out.print("Enter the number of Elements : ");
		int b=sc.nextInt();
		int[] arr2=new int[b];
		System.out.println("Enter the Elements of Array 2 : ");
		for(int i=0;i<b;i++)
		{
			arr2[i]=sc.nextInt();
		}
		System.out.print("The Common elements in two Arrays : ");
		for(int i=0;i<a;i++)
		{
			for(int j=0;j<b;j++)
			{
				if(arr1[i]==arr2[j])
				{
				System.out.print(arr1[i]+" ");
				}
			}
		}

	}

}

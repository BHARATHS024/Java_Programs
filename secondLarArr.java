package p3;
import java.util.*;

public class secondLarArr {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter size : ");
		int a=sc.nextInt();
		int[] arr=new int[a];
		System.out.print("Enter the Array Elements : ");
		for(int i=0;i<a;i++)
		{
			arr[i]=sc.nextInt();
		}
		lar(arr);
	}
	static void lar(int[] arr)
	{
		int a=arr.length;
		int l=arr[0];
		for(int i=0;i<a;i++)
		{
			if(arr[i]>l)
			{
				l=arr[i];
			}
		}
		int l2=arr[0];
		
		for(int i=0;i<a;i++)
		{
			if(arr[i]>l2 && arr[i]!=l)
			{
				l2=arr[i];
			}
		}
		
		System.out.print("2nd Large : "+l2);
	}

}

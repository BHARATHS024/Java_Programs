package p2;
import java.util.*;

public class RotateArr {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Array size : ");
		int a=sc.nextInt();
		int arr[]=new int[a];
		System.out.print("Enter the Array Elements : ");
		for(int i=0;i<a;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.print("Enter the rotating value : ");
		int b=sc.nextInt();
		rotate(arr,a,b);
	}
	static void rotate(int arr[],int a,int b)
	{
		int temp[]=new int[a];
		int k=0;
		for(int i=b;i<a;i++)
		{
			temp[k]=arr[i];
			k++;
		}
		
		for(int i=0;i<b;i++)
		{
			temp[k]=arr[i];
			k++;
		}
		for(int i=0;i<a;i++)
		{
			arr[i]=temp[i];
		}
		
		System.out.print("The rotated array : ");
		for(int i=0;i<a;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

}

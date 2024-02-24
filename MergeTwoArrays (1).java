package p2;
import java.util.*;

public class MergeTwoArrays {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter size of Array 1 : ");
		int a=sc.nextInt();
		int[] arr1=new int[a];
		System.out.print("Enter the Elements : ");
		for(int i=0;i<a;i++)
		{
			arr1[i]=sc.nextInt();
		}
		System.out.print("Enter size of Array 2 : ");
		int b=sc.nextInt();
		int[] arr2=new int[b];
		System.out.print("Enter the Elements : ");
		for(int i=0;i<b;i++)
		{
			arr2[i]=sc.nextInt();
		}
		int c=a+b;
		int[] arr3=new int[c];
		for(int i=0;i<a;i++)
		{
			arr3[i]=arr1[i];
		}
		int k=0;
		for(int i=a;i<c;i++)
		{
			arr3[i]=arr2[k];
			k++;
		}
		System.out.print("Merged Array 3 : ");
		for(int i=0;i<c;i++)
		{
			System.out.print(arr3[i]+" ");
		}
	}

}

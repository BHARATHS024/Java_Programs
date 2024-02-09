//using BubbleSort
package p2;
import java.util.*;

public class AscendOrdArr {
	static int length;

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of elements : ");
		int a=sc.nextInt();
		
		int[]arr=new int[a];
		System.out.print("Enter the elements : ");
		for(int i=0;i<a;i++)
		{
			arr[i]=sc.nextInt();
		}
		length=a;
		sortArr(arr);
		printArr(arr);
		
	}
	
	static void sortArr(int[] arr)
	{
		int temp=0;
		for(int i=0;i<length;i++)
		{
			for(int j=i+1;j<length;j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
	}
	static void printArr(int[] arr)
	{
		System.out.print("Array in Ascending Order : ");
		for(int i=0;i<length;i++)
		{
			System.out.print(+arr[i]+" ");
		}
	}

}
//Other method : using Arrays.sort() in-built function.

/*other methods: 
Using the Linear Search method
Using the Binary Search method
Using List.contains() method
Using Stream.anyMatch() method*/
package p2;
import java.util.*;

public class SearchEleInArr {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of elements : ");
		int f=sc.nextInt();
		int[] a=new int[f];
		System.out.print("Enter the elements for array : ");
		for(int i=0;i<f;i++)
		{
			a[i]=sc.nextInt();
		}
		Arrays.sort(a);
		System.out.print("Sorted array : ");
		for(int i=0;i<f;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println("");
		int count=0;
		System.out.print("Enter the number to check : ");
		int b=sc.nextInt();
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==b)
			{
				count++;
			}
		}
		if(count!=0)
		{
			System.out.println("Found.");
		}
		else
		{
			System.out.println("Not Found.");
		}
	}

}


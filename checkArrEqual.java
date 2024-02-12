package p2;
import java.util.*;

public class checkArrEqual {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Etner the number of elements : ");
		int a=sc.nextInt();
		int[]arr1=new int[a];
		System.out.print("Enter the elements for Array 1 : ");
		for(int i=0;i<a;i++)
		{
			arr1[i]=sc.nextInt();
		}
		System.out.print("Etner the number of elements : ");
		int b=sc.nextInt();
		int[]arr2=new int[a];
		System.out.print("Enter the elements for Array 2 : ");
		for(int i=0;i<b;i++)
		{
			arr2[i]=sc.nextInt();
		}
		
		boolean check=Arrays.equals(arr1,arr2);
		
		if(check==true)
		{
			System.out.println("The Arrays are equal.");
		}
		else
		{
			System.out.println("The Arrays are not equal.");
		}
		

	}

}

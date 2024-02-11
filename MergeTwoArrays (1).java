package p2;
import java.util.*;

public class MergeTwoArrays {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of elements : ");
		int a=sc.nextInt();
		int[]arr1=new int[a];
		for(int i=0;i<a;i++)
		{
			arr1[i]=sc.nextInt();
		}
		System.out.print("Enter the number of elements : ");
		int b=sc.nextInt();
		int[]arr2=new int[b];
		for(int i=0;i<b;i++)
		{
			arr2[i]=sc.nextInt();
		}
		int c=a+b;
		int[]arr3=new int[c];
		
		System.arraycopy(arr1, 0, arr3, 0, a);
		System.arraycopy(arr2, 0, arr3, a, b);
		
		System.out.println(Arrays.toString(arr3));
		

	}

}

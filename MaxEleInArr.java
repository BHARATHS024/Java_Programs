package p2;
import java.util.*;

public class MaxEleInArr {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of ele : ");
		int a=sc.nextInt();
		int[] arr=new int[a];
		System.out.print("Enter the elements : ");
		for(int i=0;i<a;i++)
		{
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		System.out.println("Maximum element in array : "+arr[a-1]);

	}

}
/*	Iterative Way
	Java 8 Stream
 	Sorting
	Using Collections.max()
 */
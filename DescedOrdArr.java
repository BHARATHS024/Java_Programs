package p2;
import java.util.*;

public class DescedOrdArr 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of elements : ");
		int a=sc.nextInt();
		Integer[] b=new Integer[a];
		System.out.print("Enter the elements : ");
		for(int i=0;i<a;i++)
		{
			b[i]=sc.nextInt();
		}
		Arrays.sort(b,Collections.reverseOrder());
		System.out.println(Arrays.toString(b));
	}
}
/*two methods
  Using Arrays.sort(arr,Collections.reverseOrder());
  Sorting and Reversing using reverse(arr);
 
*/
package p4;
import java.util.*;

public class AddTwoMatrix 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Row & Column size : ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c[][]=new int[a][b];
		int d[][]=new int[a][b];
		if(a==b)
		{
			System.out.println("Enter Matrix 1 elements : ");
			for(int i=0;i<a;i++)
			{
				for(int j=0;j<b;j++)
				{
					c[i][j]=sc.nextInt();
				}
			}
			System.out.println("Enter Matrix 2 elements : ");
			for(int i=0;i<a;i++)
			{
				for(int j=0;j<b;j++)
				{
					d[i][j]=sc.nextInt();
				}
			}
			add(c,d,a,b);
		}
		else
		{
			System.out.println("Can't add matrices of different size.");
		}
	}
	static void add(int c[][],int d[][],int a,int b)
	{
		int f[][]=new int[a][b];
		for(int i=0;i<a;i++)
		{
			for(int j=0;j<b;j++)
			{
				f[i][j]=c[i][j]+d[i][j];
			}
		}
		System.out.println("Sum of Matrix 1 & 2 : ");
		for(int i=0;i<a;i++)
		{
			for(int j=0;j<b;j++)
			{
				System.out.print(f[i][j]+" ");
			}
			System.out.println();
		}
	}
}

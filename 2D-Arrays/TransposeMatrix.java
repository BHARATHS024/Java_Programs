package p4;
import java.util.Scanner;

public class TransoseMatrix 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter size of Rows & Columns : ");
		int a=sc.nextInt();
		int c[][]=new int[a][a];
		System.out.println("Enter Elements : ");
		for(int i=0;i<a;i++)
		{
			for(int j=0;j<a;j++)
			{
				c[i][j]=sc.nextInt();
			}
		}
		transpose(c,a);
	}
	static void transpose(int c[][],int a)
	{
		int d[][]=new int[a][a];
		for(int i=0;i<a;i++)
		{
			for(int j=0;j<a;j++)
			{
				d[i][j]=c[j][i];
			}
		}
		System.out.println("Tranpose of Matrix :");
		for(int i=0;i<a;i++)
		{
			for(int j=0;j<a;j++)
			{
				System.out.print(d[i][j]+" ");;
			}
			System.out.println();
		}
	}
}

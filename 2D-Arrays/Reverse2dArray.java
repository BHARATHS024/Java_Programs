package p1;
import java.util.*;

class reverse2d{
    static void reverse(int [][]f,int a) 
    {
    	for(int i=0;i<a;i++)
    	{
        int start=0;
        int end=a-1;
        while(start<end)
        {
        	int temp=f[i][start];
        	f[i][start]=f[i][end];
        	f[i][end]=temp;
        	start++;
        	end--;
        }
    	}
    	System.out.println("Reversed Array : ");
    	for(int i=0;i<a;i++)
    	{
    		for(int j=0;j<a;j++)
    		{
    			System.out.print(f[i][j]+" ");
    		}
    		System.out.println();
    		
    	}

    }
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size : ");
        int a=sc.nextInt();
        System.out.println("Enter Array Elements : ");
        int f[][]=new int[a][a];
        for(int i=0;i<a;i++)
        {
        	for(int j=0;j<a;j++)
        	{
        		f[i][j]=sc.nextInt();
        	}
        }
        reverse(f,a);
    }
}

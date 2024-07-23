import java.util.*;
public class Main
{
	public static void main(String[] args)
	{   
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int a[]=new int[n];
	    int curr_sum,max_sum;
	    for(int i=0;i<n;i++)
	    {
	        a[i]=sc.nextInt();
	    }
	    max_sum=Integer.MIN_VALUE;
	    for(int i=0;i<n;i++)
	    {
	        curr_sum=0;
	        for(int j=i;j<n;j++)
	        {
	            curr_sum+=a[j];
	            if(curr_sum>max_sum)
	            {
	                max_sum=curr_sum;
	            }
	        }
	    }
		System.out.println(max_sum);
	}
}

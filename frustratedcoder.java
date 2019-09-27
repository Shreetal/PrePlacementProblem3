package pblm1;
import java.util.*;
public class Pro3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int[] a=new int[n];
		int[] b=new int[n];
		for(int p=0;p<n;p++)
		{
			a[p]=s.nextInt();
		}
		Arrays.sort(a);
		int i=0;
		int j=0;
		int k=0;
		int sum=0;
		while(i<n&&j<n-1)
		{
			j=j+1;
			if(a[i]<a[j])
			{	
				k++;
				i++;
			}
		}
		for(int l=k;l<n;l++)
		{
			sum=sum+a[l];
		}
		System.out.println(sum);
	}
}

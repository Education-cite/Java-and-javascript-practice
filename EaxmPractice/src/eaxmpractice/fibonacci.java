
package eaxmpractice;

import java.util.Scanner;
class fibonacci
{
	public static void main(String[] args)
	{
            int a=0,b=1,c;
	Scanner sc=new Scanner(System.in);
	System.out.println("please enter number ");
	int n=sc.nextInt();
	
	System.out.println("Fibonacci series is ");
	for(int i=0;i<n;i++)
	{
	if(i<=1)
	c=i;
	else
	{
	c=a+b;
        
	a=b;
	b=c;
	}
	System.out.println(c);
	}
	}
}

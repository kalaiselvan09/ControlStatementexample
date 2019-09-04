package org.hexa.demo;

public class Demo1 {

	public static void main(String[] args) {
		
		int a[]= {10,20,30,21,67};
		
		int len = a.length;
		
		int temp=0;
		for(int i=0;i<len;i++)
		{
			for(int j=i+1;j<len;j++)
			{
				if(a[i]<a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for(int i=0;i<len;i++)
		{
			System.out.println(a[i]);
		}
}
}

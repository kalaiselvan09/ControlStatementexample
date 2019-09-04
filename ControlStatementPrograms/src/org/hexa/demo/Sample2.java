package org.hexa.demo;

public class Sample2 {

	public static void main(String[] args) {
		
		String s1="kalaiselvan";
		String s2="";
		
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)=='a'||s1.charAt(i)=='e'||s1.charAt(i)=='i'||s1.charAt(i)=='o'||s1.charAt(i)=='u');
			{
				s2=s2+s1.charAt(i);
			}
		}
		
		System.out.println(s2);
	
}
}

package org.demo;

public class Strin {

	public static void main(String[] args) {
		
		String s1="kalaiselvan";
		
		char[] ch = s1.toCharArray();
		
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]=='a' || ch[i]=='e')
			{
				s1=s1.replace(ch[i], '@');
			}
		}
		System.out.println(s1);

	}

}

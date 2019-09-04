package org.demo;

public class Demo implements ListConcept{

	@Override
	public void add() {
		System.out.println("add");
	}

	@Override
	public void sub() {
		System.out.println("Sub");
	}

	
	public void mul() {
		System.out.println("Mul");
	}
	
public static void main(String[] args) {
	
	ListConcept s=new Demo();     
	s.add();
	s.sub();
	
	
}

}

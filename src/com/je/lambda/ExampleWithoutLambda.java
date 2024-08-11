package com.je.lambda;


@FunctionalInterface
interface B{
	void m1();
}

interface C extends B{
	void m1();
}
public class ExampleWithoutLambda implements B {
	
	@Override
	public void m1() {
		// TODO Auto-generated method stub
		System.out.println("without lambda");
	}

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     B b=new ExampleWithoutLambda();
     b.m1();
	}


}

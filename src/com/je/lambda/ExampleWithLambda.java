package com.je.lambda;


@FunctionalInterface
interface BB{
	void m1();
}

interface CC extends BB{
	void m1();
}
public class ExampleWithLambda implements BB {
	
	@Override
	public void m1() {
		// TODO Auto-generated method stub
		System.out.println("m1 from non lambda");
	}

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   //  BB bb=new ExampleWithLambda();
   //  bb.m1();
		
		BB bb=()->{
			System.out.println("m1 from lambda");
		};
		 bb.m1();
	}


}

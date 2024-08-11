package com.je.lambda;


//@FunctionalInterface
//if we do not specify explicitly as functional interface we can declare other abstract method like m2 below and get error in all implementation classes
//to avoid that by default specify @FunctionInterface then compile time itself get compile error if add other abstract method
interface BBB{
	abstract void m1();
	//abstract void m2();
}

interface CCC extends BBB{
	void m1();
}
public class FunctionalInterfaceOnlyOneAbstractMethodOtherWiseError implements BBB {
	
	@Override
	public void m1() {
		// TODO Auto-generated method stub
		System.out.println("m1 from non lambda");
	}

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   //  BB bb=new ExampleWithLambda();
   //  bb.m1();
		
		BBB bbb=()->{
			System.out.println("m1 from lambda");
		};
		 bbb.m1();
	}


}

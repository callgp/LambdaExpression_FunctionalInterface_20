package com.je.lambda;



interface FFF{
	void add (int a, int b);
}




public class AdditionWithLambdasOptimized implements F {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FFF f=(a, b) ->{
			// TODO Auto-generated method stub
			System.out.println("addition is"+(a+b));
			
		};
		f.add(180,20);
		//F f1=
	}

	@Override
	public void add(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println("addition is"+(a+b));
		
	}

}

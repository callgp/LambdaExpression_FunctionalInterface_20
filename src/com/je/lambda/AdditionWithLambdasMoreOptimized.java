package com.je.lambda;



interface FFFF{
	void add (int a, int b);
}




public class AdditionWithLambdasMoreOptimized implements FFFF {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FFF f=(a, b) ->
			// TODO Auto-generated method stub
			System.out.println("addition is"+(a+b));
			
		
		f.add(187,20);
		//F f1=
	}

	@Override
	public void add(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println("addition is"+(a+b));
		
	}

}

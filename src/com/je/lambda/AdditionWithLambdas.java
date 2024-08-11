package com.je.lambda;



interface F{
	void add (int a, int b);
}




public class AdditionWithLambdas implements F {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		F f=(int a, int b) ->{
			// TODO Auto-generated method stub
			System.out.println("addition is"+(a+b));
			
		};
		f.add(160,20);
		//F f1=
	}

	@Override
	public void add(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println("addition is"+(a+b));
		
	}

}

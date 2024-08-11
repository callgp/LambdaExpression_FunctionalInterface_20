package com.je.lambda;



interface FF{
	void add (int a, int b);
}




public class AdditionWithoutLambdas implements FF {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FF ff=new AdditionWithoutLambdas();
		ff.add(10,20);
		//F f1=
	}

	@Override
	public void add(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println("addition is"+(a+b));
		
	}

}

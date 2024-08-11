package com.je.lambda;

@FunctionalInterface
public interface FunctionalInterfaceMultipleAbstractMethodsError {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	//any number of default methods ok...any number of static methods ok but only one abstract method allowed in FunctionalInterface
	void deleteUser();
	void createUser();
	
}

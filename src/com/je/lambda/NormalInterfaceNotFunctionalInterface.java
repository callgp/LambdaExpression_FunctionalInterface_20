package com.je.lambda;

//@FunctionalInterface
public interface NormalInterfaceNotFunctionalInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	//any number of default inerfaces ok
	void deleteUser();
	void createUser();
	
	//cannot use default methods like below in java version below 8
	default void modifyUser() {
		
	}
	
	//cannot use default methods like below in java version below 8
    static void purgeUser() {
		
	}
}

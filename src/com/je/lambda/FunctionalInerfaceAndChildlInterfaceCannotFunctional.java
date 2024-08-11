package com.je.lambda;

public interface FunctionalInerfaceAndChildlInterfaceCannotFunctional {

	void createUser();
	
	default void notifications() {
		
	}
//@FunctionalInterface	
//Invalid '@FunctionalInterface' annotation; FunctionalInerfaceAndChildlInterfaceCannotFunctional.UserJpaRepository is not a functional 
//interface..since deleteUSer conisdered second abstract method of Parent FunctionalInerfaceAndChildlInterfaceCannotFunctional cannot declare child interface as the functional interface 
	interface UserJpaRepository extends UserRepository{
		void deleteUser();
	}
}

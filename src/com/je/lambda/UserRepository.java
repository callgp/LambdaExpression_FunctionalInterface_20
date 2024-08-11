package com.je.lambda;

public interface UserRepository {

	void createUser();
	
	default void notifications() {
		
	}
}

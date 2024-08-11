package com.je.lambda;

public class UserTestUsingInterfaceReferenceAnanymousClass implements UserRepository {

	public static void main(String[] args) {
		
		//normal way
		UserRepository user=new UserTestUsingInterfaceReferenceAnanymousClass();
		user.createUser();
		
		//using non normal way using  anonymous inner class way these replaced now with labda expression
	//	UserRepository user2=new UserRepository() {
			
//			@Override
//			public void createUser() {
				// TODO Auto-generated method stub
	//			System.out.println("create user in anaonymous inner class");
//			}
//		};
//		user2.createUser();
		
		UserRepository user3=()-> {
			// TODO Auto-generated method stub
		System.out.println("create user in lambda implementation");	
	};
	user3.createUser();
	}
	@Override
	public void createUser() {
		// TODO Auto-generated method stub
		System.out.println("create user");
	}

}

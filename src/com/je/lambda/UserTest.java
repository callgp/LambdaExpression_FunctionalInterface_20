package com.je.lambda;

public class UserTest implements UserRepository {

	public static void main(String[] args) {
		
		//normal way
		UserRepository user=new UserTest();
		user.createUser();
		
		//using non normal way using  anaonymous inner class way these replaced now with labda expression
		UserRepository user2=new UserRepository() {
			
			@Override
			public void createUser() {
				// TODO Auto-generated method stub
				System.out.println("create user in anaonymous inner class");
			}
		};
		user2.createUser();
	}
	@Override
	public void createUser() {
		// TODO Auto-generated method stub
		System.out.println("create user");
	}

}

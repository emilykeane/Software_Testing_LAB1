package tests;


import model.User;

public class UserTests {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test_username = "mike";
		String test_password = "my_passwd";
		String test_first_name = "Mike";
		String test_last_name = "Smith";
		String test_mobile_number = "07771234567";
		User testUser = new User(test_username, test_password,test_first_name , test_last_name, test_mobile_number);
		
		System.out.println(testUser);
		
		assert testUser.getUsername() == test_username;
		assert testUser.getPassword() == test_password;
		assert testUser.getFirst_name() == test_first_name;
		assert testUser.getLast_name() == test_last_name;
		assert testUser.getMobile_number() == test_mobile_number;
		System.out.println("A");
		assert 1==2;
		
	}

}

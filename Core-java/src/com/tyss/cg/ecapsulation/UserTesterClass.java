package com.tyss.cg.ecapsulation;

public class UserTesterClass {
	
//	private static void setUser(User user) {
//		new User(user.getUsername(),user.getPassword(),user.getUserid());
//	}
	
//	private static User setUser(String userame,String password,int userid) {
//		return new User("Abi","123",456);
//	}
	
	public static void main(String[] args) {
		
		User user1 = new User("Mike","qwerty",234567);
		User user2= new User();
		
		
		user2.setUsername("Toly");
		user2.setUserid(1234);
		user2.setPassword("Toly");
		
		System.out.println("Username: "+user1.getUsername());
		System.out.println("Userid: "+user1.getUserid());
		System.out.println("Password: "+user1.getPassword());
		
		System.out.println(user2);
	}
}

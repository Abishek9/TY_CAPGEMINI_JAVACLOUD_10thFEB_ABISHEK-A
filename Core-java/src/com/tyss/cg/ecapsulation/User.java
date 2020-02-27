package com.tyss.cg.ecapsulation;

public class User {
	private String username;
	private String password;
	private int userid;

	public User(String username, String password, int userid) {
		this.username = username;
		this.password = password;
		this.userid = userid;
	}

	public User() {

	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	@Override
	public String toString() {
		return "User [username=" + username + ", userid=" + userid + "]";
	}

	
	

}

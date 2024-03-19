package com.java.job;

public class Constructors {
		String userName;
		long pw;
		char gender;
		
		public Constructors(String userName,long pw,char gender) {
			this.userName=userName;
			this.pw=pw;
			this.gender=gender;
			
		}
		public void login(String userName,long pw) {
			if(userName==this.userName) {
				if(pw==this.pw) {
					System.out.println("succesfully logged in");
				}
				else {
					System.out.println("invalid password");
				}
			}
			else {
				System.out.println("invalid username");
			}
		}
		public void logout() {
			System.out.println("logged out");
		}
}

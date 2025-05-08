package com.javaex.ex04;

public class UserApp {

	public static void main(String[] args) {
		
		User[] user = new User[3];
		
		
		User uc1 = new Customer("jws", "j1234", "정우성", 1000);
		User uc2 = new Customer("yjs", "y2345", "이효리", 2000);
		User ue = new Employee("master", "m7788", "운영자", 5000000);
		
		user[0] = uc1;
		user[1] = uc2;
		user[2] = ue;
		
		for(int i=0; i<user.length; i++) {
			user[i].showInfo();
		}
		
		System.out.println("운영자의 월급은 " + ((Employee)ue).getSalary() + "원 입니다.");
		
		
		
		
	}

}

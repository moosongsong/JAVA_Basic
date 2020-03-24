package com.my.uttl;

public class Student {
	Person p =new Person();
	
	public void func() {
		p.setName("심청이");//private 땜시 안됨.
		//요렇게 접근하면 됨
	}
}

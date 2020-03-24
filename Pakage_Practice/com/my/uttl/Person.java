package com.my.uttl;

public class Person {
	//private String name;
	private String name;//default 접근제한이다. 동일한 패키지 안에서만 사용가능.
	//private 동일한 클래스안에서만
	//public은 어디서나 접근 가능

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}

package com.my.mydata;
import com.my.uttl.Person;//패키지 구문이 우선적으로 나오고 그다음에 import


	public class Teacher {//class는 default와 public만 사용가능(만약 내부클래스이면 다 쓸수 있긴함)
		Person p;
		
		public Teacher() {
			// TODO Auto-generated constructor stub
			p= new Person();
			p.setName("홍길동");//person이 다른 패키지에 있어서 기본접근 제한자여서 접근을 하지 못함.
		}
	}
	
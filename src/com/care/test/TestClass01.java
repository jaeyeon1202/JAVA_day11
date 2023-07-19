package com.care.test;

public class TestClass01 {

	public void test() {
		System.out.println("test");
	}
	
	 void test2() {//생략된 키워드 -> default ,, 같은 패키지에 존재한다면 디폴트호출이 가능하다.
		System.out.println("test2");
	}
}

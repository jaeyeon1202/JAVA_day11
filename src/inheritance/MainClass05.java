package inheritance;

class Test05{
	public Test05(String s) {
		System.out.println(s+": 부모생성자");
	}
	public Test05() {
		System.out.println("default생성자");//super라는 키워드가 없으면 기본생성자가 실행됨.
	}
}

class TestClass05 extends Test05{	
	
	public TestClass05() {
		//super(s);//super키워드를 이용해서 값을 넘겨주면 부모클래스의 값을 받는 생성자가 실행된다.
		System.out.println("자식 생성자");
	}
	public TestClass05(String s) {
		super(s);
		System.out.println(s+"자식 생성자");
	}
}

public class MainClass05 {
	public static void main(String[] args) {
		TestClass05 t = new TestClass05();
		TestClass05 t2 = new TestClass05("값전달!");
		
	}
}

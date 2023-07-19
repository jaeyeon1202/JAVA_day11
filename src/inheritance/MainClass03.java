package inheritance;

class test03{
	public test03() {
		System.out.println("부모 생성자 실행");
	}
}

class TestClass03 extends test03{
	public TestClass03(){
		System.out.println("자식 생성자 실행");
	}
}

public class MainClass03 {
	public static void main(String[] args) {
		TestClass03 t = new TestClass03();
		
	}
}

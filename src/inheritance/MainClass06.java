package inheritance;

class Test06{
	public int num;
	public Test06() {num=100;}
}

class TestClass06 extends Test06{
	int num=777;
	public void test() {
		System.out.println(num);
		System.out.println(super.num);
	}
	
	
	
	
}

public class MainClass06 {
	public static void main(String[] args) {
		TestClass06 y = new TestClass06();
		y.test();
		
		
		
		
	}
}

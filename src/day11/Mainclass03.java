package day11;

import javax.swing.plaf.synth.SynthOptionPaneUI;

class TestClass03{
	
	static TestClass03 t;
	
	private TestClass03() {
		System.out.println("생성자 실행");
	}//외부의 접급인 안되니께
	 
	public static TestClass03 getInstance() {
		
		System.out.println(t+"  test 실행");
		if(t==null)
			t = new TestClass03();
		return t;
	}//내부에서 만들어서 외부에서 호출해서 접근 -> 내부에 있는 메소드를 통해서 접근하겠다:싱글톤
}


public class Mainclass03 {

	public static void main(String[] args) {
		//TestClass03 t01 = new TestClass03();

		TestClass03 t01 = TestClass03.getInstance();
		TestClass03 t02 = TestClass03.getInstance();
		TestClass03 t03 = TestClass03.getInstance();
		
	 System.out.println(t01);
	 System.out.println(t02);
	 System.out.println(t03);
	}
	

}

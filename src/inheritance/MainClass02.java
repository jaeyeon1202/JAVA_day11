package inheritance;

class Calc02{
	public void display() {
		System.out.println("나는야 계산기");
	}
}
class Computer02 extends Calc02{
	Calc02 c;
	public Computer02() {c = new Calc02();}
	
	public void print() {
		System.out.println("print");
		display();
		System.out.println("나는야 컴퓨터");
	}
}

public class MainClass02 {
	public static void main(String[] args) {
		//Calc02 c = new Calc02();
		//c.display();
		
		Computer02 c = new Computer02();
		c.print();
		
	}
}

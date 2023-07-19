package day11;

public class Mainclass04 {

	public static void main(String[] args) {
		
		//현재시가출력
		long time =System.currentTimeMillis();
		System.out.println(time);
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		long end = System.currentTimeMillis();
		System.out.println(time-end);
		System.out.println((time-end)/1000+"초 사용");
		System.out.println("출력");
	}

}

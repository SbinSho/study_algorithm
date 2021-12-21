package baekjoon.levelTest.third;

public class ThirdTest {

	public static void main(String[] args) {
		
		ForQuestion2 que = new ForQuestion2();
	
		long start = System.currentTimeMillis();
		
		que.smallX();
		
		long end = System.currentTimeMillis();
		
		System.out.println("함수 실행 시간 : " + ((end-start)/1000) + " ms " );
		
	}

}

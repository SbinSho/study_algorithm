package baekjoon.levelTest.first;

public class ExplanationTest {
	
	private static final String[] TESTCASE = {
			"Hello World!",
			"강한친구 대한육군\n강한친구 대한육군",
			"\\    /\\\r\n"
			+ " )  ( ')\r\n"
			+ "(  /  )\r\n"
			+ " \\(__)|",
			"|\\_/|\r\n"
			+ "|q p|   /}\r\n"
			+ "( 0 )\"\"\"\\\r\n"
			+ "|\"^\"`    |\r\n"
			+ "||_/=\\\\__|"
			
	};
	
	public static boolean 입출력문제_테스트(int n, String str) {
		
		System.out.println((n + 1) + " 번째 문제 테스트 시작.");
		
		if(TESTCASE[n].equals(str)) {
			System.out.println((n + 1) + " 번째 문제 테스트 성공.");
			System.out.println("=============================");
			return true;
		}
		else {
			System.out.println((n + 1) + " 번째 문제 테스트 실패.");
			System.out.println("=============================");
			return false;
		}
		
	}

	public static void main(String[] args) {
		
		int count = 0;
		
		Explanation ex = new Explanation();
		
		if(입출력문제_테스트(0, ex.worldPrint())){
			count++;
		}
		if(입출력문제_테스트(1, ex.armyPrint())){
			count++;
		}
		if(입출력문제_테스트(2, ex.catPrint())){
			count++;
		}
		if(입출력문제_테스트(3, ex.dogPrint())){
			count++;
		}
		
		System.out.println("입출력 테스트 완료");
		System.out.println("총 4개의 테스트 중 " + count + " 개 완료.");
		
	}
}

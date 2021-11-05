package baekjoon.levelTest.first;

// 입출력 문제 해답
public class Explanation {
	
	// 1단계 : Hello World 출력
	public String worldPrint() {
		String reStr = "Hello World!";
		
		return reStr;
	}
	
	// 2단계 : 강한친구 대한육군 한 줄에 한번씩 출력
	public String armyPrint() {
		String reStr = "강한친구 대한육군\n강한친구 대한육군";
		
		return reStr; 
	}
	
	// 3단계 : 고양이 출력
	public String catPrint() {
		String reStr = "\\    /\\\r\n"
				+ " )  ( ')\r\n"
				+ "(  /  )\r\n"
				+ " \\(__)|";
		
		return reStr;
	}

	// 4단계 : 개 출력
	public String dogPrint() {
		String reStr = "|\\_/|\r\n"
				+ "|q p|   /}\r\n"
				+ "( 0 )\"\"\"\\\r\n"
				+ "|\"^\"`    |\r\n"
				+ "||_/=\\\\__|";
		
		return reStr;
	}

}

package baekjoon.levelTest.second;

// 2단계 문제 테스트
public class IfQuestionTest {

	// 두 수 비교하기
	public static boolean comparisonTest(IfQuestion que) {
		
		int[][] input = {{1,2}, {10,2}, {5,5}};
		String[] output = { "<", ">", "=="};
		String result = null;
		
		for(int i = 0; i < 3; i++) {
			
			result = que.comparison(input[i][0], input[i][1]);
			
			if( !result.equals(output[i])) {
				return false;
			}
		}
		
		return true;
	}

	// 시험 성적
	public static boolean scoreTest(IfQuestion que) {
		
		int input = 100;
		String output = "A";
		String result = que.score(input);
		
		if( result.equals(output)) {
			return true;
		} else {
			return false;
		}
		
	}

	// 윤년
	public static boolean leapYearTest(IfQuestion que) {
		
		int[] input = { 2000, 1999 };
		int[] output = { 1, 0 };
		int[] resultArr = new int[2];
		
		for(int i = 0; i < 2; i++) {
			resultArr[i] = que.leapYear(input[i]);
		}
		
		for(int i = 0; i < 2; i++) {
			if(resultArr[i] != output[i]) {
				return false;
			}
		}
		
		return true;
	}

	// 사분면 고르기
	public static boolean quadrantTest(IfQuestion que) {
		
		int[][] input = {{12, 5}, {9, -13}};
		int[] output = {1, 4};
		int[] resultArr = new int[2];
		
		for(int i = 0; i < 2; i++) {
			resultArr[i] = que.quadrant(input[i][0], input[i][1]);
		}
		
		for(int i = 0; i < 2; i++) {
			if(resultArr[i] != output[i]) {
				return false;
			}
		}
		
		return true;
	}

	// 알람 시계
	public static boolean clockTest(IfQuestion que) {
		
		int[][] input = {
				{10, 10}, 
				{0, 30}, 
				{23, 40}
		};
		
		int[][] output = {
				{ 9, 25 },
				{ 23, 45 },
				{ 22, 55 }
		};
		
		int[][] resultArr = new int[3][2];
		
		for(int i = 0; i < 3 ; i++) {
			
			int[] arr = que.clock(input[i][0], input[i][1]);
			
			resultArr[i][0] = arr[0];
			resultArr[i][1] = arr[1];
			
		}

		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 2; j++) {
				if(resultArr[i][j] != output[i][j]) {
					return false;
				}
			}
		}
		
		
		return true;
	}
	
	public static void main(String[] args) {
		
		IfQuestion que = new IfQuestion();
		int count = 0;
		
		if(clockTest(que)) {
			System.out.println("알람 시계 문제 테스트 성공.");
			count++;
		}
		if(quadrantTest(que)) {
			System.out.println("사분면 문제 테스트 성공.");
			count++;
		}
		if(leapYearTest(que)) {
			System.out.println("윤년 문제 테스트 성공.");
			count++;
		}
		if(scoreTest(que)) {
			System.out.println("성적 문제 테스트 성공.");
			count++;
		}
		if(comparisonTest(que)) {
			System.out.println("두 수 비교 문제 테스트 성공.");
			count++;
		}
		
		System.out.println("================");
		System.out.println("모든 테스트 종료. 총 5개의 테스트 중 " + count + "개의 테스트 성공.");
		
	}
}

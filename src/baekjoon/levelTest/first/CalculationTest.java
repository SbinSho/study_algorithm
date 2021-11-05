package baekjoon.levelTest.first;

public class CalculationTest {
	
	private static final int[] CALTESTCASE = { 10, 4, 21, 2 ,1 };
	private static final int[] RETESTCASE = { 1, 1, 0, 0 };
	private static final int[] LASTMULCASE = { 2360, 3776, 1416, 181720 };
	
	// 두개의 정수형 배열이 같은 길이, 같은 값인지 확인
	public static boolean arrChek(int[] arr1, int[] arr2) {
		
		if(arr1.length != arr2.length) {
			return false;
		}
		
		for(int i = 0; i < arr1.length; i++) {
			if(arr1[i] != arr2[i]) {
				return false;
			}
		}
		
		return true;
	}

	public static void main(String[] args) {
		
		int count = 0;
		
		Calculation cal = new Calculation();
		
		if(cal.mul(1, 2) == 2) {
			System.out.println("7단계 성공.");
			count++;
		}
		if(cal.div(1, 3) == 0.33333333333333333333333333333333 && cal.div(4, 5) == 0.8) {
			System.out.println("8단계 성공.");
			count++;
		}
		if(arrChek(cal.cal(7, 3), CALTESTCASE)) {
			System.out.println("9단계 성공.");
			count++;
		}
		if(arrChek(cal.remainder(5, 8, 4), RETESTCASE)) {
			System.out.println("10단계 성공.");
			count++;
		}
		if(arrChek(cal.lastMul(472, 385), LASTMULCASE)) {
			System.out.println("11단계 성공.");
			count++;
		}
		
		System.out.println("모든 테스트 완료.");
		System.out.println("총 5개의 테스트 중 " + count + "개 완료.");
	}
	
}

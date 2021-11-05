package baekjoon.levelTest.first;

// 연산 문제 해답
public class Calculation {

	// 7단계 : AxB
	public int mul(int a, int b) {
		int result = 0;
		result = a*b;

		System.out.println("AxB");
		System.out.println("입력된 a, b 값 : " + a + ", " + b);
		System.out.println("처리된 값 : " + (a * b));
		
		return result;
	}
	
	// 8단계 : A/B
	public double div(double a, double b) {
		double result = 0;
		
		result = a/b;
	
		System.out.println("A/B");
		System.out.println("입력된 a, b 값 : " + a + ", " + b);
		System.out.println("처리된 값 : " + (a / b));
		
		return result;
	}
	
	// 9단계 : 사칙연산
	public int[] cal(int a, int b) {
		int[] result = new int[5];
		
		result[0] = a + b;
		result[1] = a - b;
		result[2] = a * b;
		result[3] = a / b;
		result[4] = a % b;
		
		System.out.println("사칙연산");
		System.out.println("입력된 a, b 값 : " + a + ", " + b);
		System.out.println("처리된 값 : ");
		
		for (int i : result) {
			System.out.println(i);
		}
		
		return result;
	}
	
	// 10단계 : 나머지
	public int[] remainder(int a, int b, int c) {
		
		int[] result = new int[4];
		
		result[0] = (a + b) % c;
		result[1] = ((a % c) + (b % c)) %c;
		result[2] = (a * b) % c;
		result[3] = ((a % c) * (b % c)) %c;
		
		System.out.println("나머지");
		System.out.println("입력된 a, b 값 : " + a + ", " + b);
		System.out.println("처리된 값 : ");
		
		for (int i : result) {
			System.out.println(i);
		}
		
		return result;
	}
	
	// 11단계 : 곱셈
	public int[] lastMul(int a, int b) {
		
		int[] result = new int[4];
		
		result[0] = a * ( b % 10 );
		result[1] = a * ( (b / 10) % 10 );
		result[2] = a * (b / 100);
		result[3] = result[0] + (result[1] * 10) + (result[2] * 100);
		
		
		System.out.println("곱셈");
		System.out.println("입력된 a, b 값 : " + a + ", " + b);
		System.out.println("처리된 값 : ");
		
		for (int i : result) {
			System.out.println(i);
		}
		return result;
	}

}

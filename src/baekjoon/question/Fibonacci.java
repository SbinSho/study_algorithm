package baekjoon.question;

public class Fibonacci {
	
	
	public static int fibonacci(int n) {
		
		if(n == 0) {
			System.out.print("0");
			return 0;
		} else if(n == 1) {
			System.out.print("1");
			return 1;
		} else {
			return fibonacci(n - 1) + fibonacci(n - 2);
		}
		
	}
	
	public static void main(String[] args) {
		
		fibonacci(3);
		System.out.println();
		fibonacci(0);
		System.out.println();
		fibonacci(1);
		System.out.println();
		fibonacci(3);
		
	}
	
	

}

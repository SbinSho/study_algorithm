package programmers;

public class 내적 {

	static int solution(int[] a, int[] b) {
        int answer = 0;
        
		for(int i = 0; i < 4; i++) {
			answer += a[i] * b[i];
		}
		
        return answer;
    }

	public static void main(String[] args) {

		int[] a = { 1, 2, 3, 4 };
		int[] b = {-3, -1, 0, 2 };
		
		System.out.println(solution(a, b));
	}

}

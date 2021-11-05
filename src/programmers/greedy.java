package programmers;

import java.util.Arrays;

public class greedy {

	static int solution(int n, int[] lost, int[] reserve) {
		int answer = n;

		// 학생 수 만큼 배열을 초기화
		int[] arr = new int[n];

		// 체육복을 잃어버린 학생 체크
		for (int i : lost) {
			arr[i - 1]--;
		}

		// 여분의 체육복을 가져온 학생 체크
		for (int i : reserve) {
			arr[i - 1]++;
		}
		
		System.out.println(Arrays.toString(arr));

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] == -1) {
				if ( i-1 >= 0 && arr[i - 1] == 1) {
					arr[i]++;
					arr[i + 1]--;
				}
				else if ( i+1 < arr.length && arr[i + 1] == 1) {
					arr[i]++;
					arr[i - 1]--;
				}
				else {
					answer--;
				}
			}

		}
		
		return answer;
	}

	public static void main(String[] args) {

		int[] lost = { 1, 2, 3 };
		int[] reserve = { 2, 3, 4 };

		System.out.println(solution(5, lost, reserve));

	}

}

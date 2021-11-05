package programmers;

public class 로또의최고순위와최저순위 {

	public static int[] solution(int[] lottos, int[] win_nums) {
		int[] answer = new int[2];

		int[] rank = { 0, 6, 5, 4, 3, 2, 1 };

		int zero_count = 0;
		int cnt = 0;

		for (int i = 0; i < lottos.length; i++) {
			if (lottos[i] == 0)
				zero_count++;
			else {
				for (int j = 0; j < win_nums.length; j++) {
					if (lottos[i] == win_nums[j]) {
						cnt++;
						break;
					}
				}
			}
		}

		int max = cnt == 0 ? 1 : cnt;
		int min = cnt == 0 ? 1 : cnt;

		if (zero_count > 0) {
			max = cnt + zero_count;
		}

		answer[0] = rank[max];
		answer[1] = rank[min];

		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// int[] lottos = { 44, 1, 0, 0, 31, 25 };
		int[] lottos = { 32, 39, 44, 41, 5, 7 };
		int[] win_nums = { 31, 10, 45, 1, 6, 19 };

		System.out.println(solution(lottos, win_nums));

	}
}


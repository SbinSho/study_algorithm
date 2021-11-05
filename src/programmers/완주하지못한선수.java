package programmers;

import java.util.Arrays;

public class 완주하지못한선수 {

	static String solution(String[] participant, String[] completion) {
		
		// 오름차순 정렬
		Arrays.sort(participant);
		Arrays.sort(completion);
		
		int i;
		for(i = 0; i < completion.length; i++) {
			
			if(!participant[i].equals(completion[i])) {
				return participant[i];
			}
		
		}

		
		return participant[i];
	}

	public static void main(String[] args) {

		String[] participant = { "1", "2", "3", "4" };
		String[] completion = { "1", "2", "3" };

		long start;
		long end;

		start = System.nanoTime();
		System.out.println(solution(participant, completion));
		end = System.nanoTime();
		System.out.println("실행 시간 : " + (end - start));
	}

}

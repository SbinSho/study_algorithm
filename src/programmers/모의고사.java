package programmers;

import java.util.ArrayList;

public class 모의고사 {

	
    public static int[] solution(int[] answers) {

    	int[] st1_arr = {1, 2, 3, 4 ,5};
        int[] st2_arr = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] st3_arr = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        
        int[] score = new int[3];
        
        // 1번 학생 관련 변수
        int st1_num = 0;
        // 2번 학생 관련 변수
        int st2_num = 0;
        // 3번 학생 관련 변수
        int st3_num = 0;
        
        int max_cnt = 0;
        
        for(int i = 0; i < answers.length; i++) {
        	
        	if(st1_num == 5) st1_num = 0;
        	if(st2_num == 8) st2_num = 0;
        	if(st3_num == 10) st3_num = 0;
        	
        	// 1번 학생 문제 답안 비교
        	if(answers[i] == st1_arr[st1_num]) score[0]++;
        	// 2번 학생 문제 답안 비교
        	if(answers[i] == st2_arr[st2_num]) score[1]++;
        	// 3번 학생 문제 답안 비교
        	if(answers[i] == st3_arr[st3_num]) score[2]++;
        	
        	if(max_cnt < score[0]) max_cnt = score[0];
        	if(max_cnt < score[1]) max_cnt = score[1];
        	if(max_cnt < score[2]) max_cnt = score[2];
        	
        	st1_num++;
        	st2_num++;
        	st3_num++;
        }
        
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i = 0; i < 3; i++) {
        	if(max_cnt == score[i]) list.add(i+1);
        }

        int[] answer = new int[list.size()];
        
        for(int i = 0; i < answer.length; i++) {
        	answer[i] = list.get(i);
        }
        
		return answer;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] answers = {1,3,2,4,2};	

		int[] abc = solution(answers).clone();
		
		for (int i : abc) {
			System.out.println(i);
		}
	}

}

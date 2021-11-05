package programmers;

import java.util.ArrayList;
import java.util.List;

public class 크레인인형뽑기게임 {

	static int solution(int[][] board, int[] moves) {
		int answer = 0;
		
		List<Integer> list = new ArrayList<Integer>();
		 
		for (int mv : moves) {
			
			for(int i = 0; i < board.length; i++) {
				
				if(board[i][ mv - 1] != 0) {
					
					if(!list.isEmpty() && list.get( list.size() - 1) == board[i][ mv - 1]) {
						list.remove( list.size() - 1);
						answer += 2;
					}
					else {
						list.add(board[i][ mv - 1]);
					}

					board[i][ mv - 1] = 0;

					break;
				}
			}
			
		}
		
		return answer;

	}

	public static void main(String[] args) {

		int[][] board = { 
				{ 0, 0, 0, 0, 0 }, 
				{ 0, 0, 1, 0, 3 }, 
				{ 0, 2, 5, 0, 1 }, 
				{ 4, 2, 4, 4, 2 },
				{ 3, 5, 1, 3, 1 } 
				
		};
		
		int[] moves = { 1, 5, 3, 5, 1, 2, 1, 4 };
		
		System.out.println(solution(board, moves));

		
	}

}

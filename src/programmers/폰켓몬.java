package programmers;

import java.util.HashSet;

public class 폰켓몬 {

    public static int solution(int[] nums) {
        int answer = nums.length / 2;
        
        HashSet<Integer> set = new HashSet<>();
        
        for (int i : nums) {
			set.add(i);
		}
        
        System.out.println(set.toString());
        
        if(set.size() < answer)	answer = set.size();
        
        return answer;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = { 3, 1 , 2, 3 };
		
		System.out.println(solution(nums));
		
		
	}

}

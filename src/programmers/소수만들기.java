package programmers;

public class 소수만들기 {
	
	
    public static int solution(int[] nums) {
        int answer = 0;

        for(int i = 0; i < nums.length-2; i++) {
        	
        	for(int j = i+1; j < nums.length - 1; j++) {
        		for(int k = j+1; k < nums.length; k++) {
        			
        			int sum = nums[i] + nums[j] + nums[k];
        			
        			int n = 2;
        			for(n = 2; n < sum; n++) {
        				if(sum%n == 0) break;
        			}
        			
        			if(n == sum) answer++;
        		}
        	}
        }
        
        
        
        return answer;
    }
    
	public static void main(String[] args) {
		
		int[] nums = { 1,2,7,6,4};
		
		System.out.println(solution(nums));
		
	}
	
	
}

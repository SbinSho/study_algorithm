package programmers;

public class 음양더하기 {
	
    public static int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        
        for(int i = 0; i < signs.length; i++) {
        	
        	if(!signs[i]) absolutes[i] *= -1;
        	
        }
        
        for(int i = 0; i < absolutes.length; i++) {
        	answer += absolutes[i];
        }
        
        return answer;
    }
    
    public static void main(String[] args) {
    	
    	
    	int[] absolutes = { 4,7,12 };
    	boolean[] signs = { true, false, true }; 
    	
    	
    	System.out.println(solution(absolutes, signs));
    	
    	
    	
    }
    
    
    
}

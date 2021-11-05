package baekjoon.levelTest.second;

// 2단계 : if 문
public class IfQuestion {
	
	// 두 수 비교하기
	public String comparison(int a, int b) {
		
		String result = null;
		
		if(a < b) {
			result = "<";
		} else if(a > b) {
			result = ">";
		} else {
			result = "==";
		}
		
		return result;
	}
	
	// 시험 성적
	public String score(int score) {
		
		String result = null;
		
		if(score >= 90 && score <= 100) {
			result = "A";
		} else if(score >= 80 && score <= 89) {
			result = "B";
		} else if(score >= 70 && score <= 79) {
			result = "C";
		} else if(score >= 60 && score <= 69) {
			result = "D";
		} else {
			result = "F";
		}
		
		return result;
	}
	
	// 윤년
	public int leapYear(int year) {
		
		int result = 0;
		
		if( year%4 == 0) {
			if( year%100 == 0 ) {
				if( year%400 == 0) {
					result = 1;
				}
			} else {
				result = 1;
			}
		}
		
		return result;
	}
	
	// 사분면 고르기
	public int quadrant(int x, int y) {
		
		int result = 0;
		
		if(x > 0 && y > 0) {
			result = 1;
		} else if(x < 0 && y > 0) {
			result = 2;
		} else if(x < 0 && y < 0) {
			result = 3;
		} else {
			result = 4;
		}
		
		return result;
	}
	
	// 알람 시계
	public int[] clock(int hour, int min) {
		
		int[] result = new int[2];
		
		if(min < 45) {
			hour--;
			if( hour < 0 ) {
				hour = 23;
			}
			
			result[0] = hour;
			result[1] = ( min - 45 ) + 60 ;
			
		} else {
			
			result[0] = hour;
			result[1] = min - 45;
		}
		
		return result;
		
	}
}

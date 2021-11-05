package programmers;

public class 신규아이디추천 {
	public static String solution(String new_id) {
		String answer = "";

		// 1단계. 모든 대문자를 대응되는 소문자로 치환합니다.
		// 2단계 에서 사용할 char형 배열에 new_id를 소문자로 치환후 초기화
		char[] ch_arr = new_id.toLowerCase().toCharArray();
		
		// 2단계. 알파벳 소문자, 숫자, 빼기(-), 밑줄(_), 마침표(.)를 제외한 모든 문자를 제거합니다.
		/*
			 복습
			 	String 클래스는 인스턴스를 한번 생성하고 나서는 인스턴스가 가진  문자열 값을 변경 할 수 가 없다. ( 불면 객체 )
			 	기존의 클래스에 새로운 값을 할당하게 되면 (str = str1 + str2) 생성된 클래스의 주소값이 새롭게 생성 된다.
			 	그러므로 문자열 값을 변경하지 못하는 단점을 보완한 StringBuilder 사용 
		 */
		StringBuilder builder = new StringBuilder();
		for (char c : ch_arr) {
			if( (c >= 'a' && c <= 'z') || (c >= '0' && c <= '9') || (c == '-' || c == '_' || c == '.')) {
				builder.append(c);
			}
			
		}
		System.out.println("2단계  : " + builder.toString());
		
		//3단계. 마침표(.)가 2번 이상 연속된 부분을 하나의 마침표(.)로 치환합니다.
		while(builder.indexOf("..") != -1) {
			int start = builder.indexOf("..");
			int end = start + 2;
			builder.replace(start, end, ".");
		}
		System.out.println("3단계  : " + builder.toString());
		//4단계. 마침표(.)가 처음이나 끝에 위치한다면 제거합니다.
		if(builder.length() > 0 && builder.indexOf(".") == 0) {
			builder.delete(0, 1);
		}
		
		if( builder.length() > 0 && builder.lastIndexOf(".") == builder.length() - 1) {
			builder.delete(builder.length() - 1, builder.length());
		}
		
		System.out.println("4단계  : " + builder.toString());
		
		// 5단계. 빈 문자열이라면, new_id에 "a"를 대입합니다.
		if(builder.toString().isEmpty()) {
			builder.append("a");
		}
		
		System.out.println("5단계  : " + builder.toString());
		
		// 6단계. 아이디의 길이가 16자 이상이므로, 처음 15자를 제외한 나머지 문자들이 제거되었습니다.
		int builder_length = builder.length();
		
		if(builder_length > 15) {
			answer = builder.toString().substring(0, 15);
			
			if( answer.charAt(answer.length()-1) == '.') {
				answer = answer.substring(0, answer.length() - 1);
			}
			System.out.println("6단계  : " + builder.toString());
		} 
		// 7단계. new_id의 길이가 2자 이하라면, new_id의 마지막 문자를 new_id의 길이가 3이 될 때까지 반복해서 끝에 붙입니다.
		else if(builder_length < 3) {
			
			char ch = builder.charAt( builder_length - 1 );
			for(int i = builder_length; i < 3; i++) {
				builder.append(ch);
			}
			System.out.println("7단계  : " + builder.toString());
			answer = builder.toString();
		}
		else {
			answer = builder.toString();
		}
		
		return answer;
	}

	public static String regx_solution(String user_id) {
		
		// 정규식 표현 사용
		
		String an = user_id.toLowerCase();
		System.out.println("1단계 : " + an); // 1단계
		an = an.replaceAll("[^-_.a-z0-9]", "");
		System.out.println("2단계 : " + an); // 2단계
		an = an.replaceAll("[.]{2,}", ".");
		System.out.println("3단계 : " + an); // 3단계
		an = an.replaceAll("^[.]|[.]$", "");
		System.out.println("4단계 : " + an); // 4단계
		
		if(an.isEmpty()) {
			an = "a";
		}
		
		if(an.length() > 15) {
			an = an.substring(0, 15);
			
			if(an.charAt(an.length() - 1) == '.') {
				an = an.substring(0, an.length() - 1);
			}
		}
		else if(an.length() < 3) {
			for(int i = an.length(); i < 3; i++) {
				an += an.charAt(i-1);
			}
		}
		
		
		return an;
		
		
	}
	
	public static void main(String[] args) {

		String new_id = "=.=";

		String re = regx_solution(new_id);
		
		System.out.println("re : " + re);
		

	}

}

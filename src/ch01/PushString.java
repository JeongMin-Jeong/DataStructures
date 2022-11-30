package ch01;

public class PushString {
	
	public int solution(String A, String B) {
        int answer = 0;
        
        String tmp = B.repeat(2);
        answer = tmp.indexOf(A);
        
        return answer;
    }

	public static void main(String[] args) {
		String A1 = "hello", B1 = "ohell";
		String A2 = "apple", B2 = "elppa";
		
		PushString pushString = new PushString();
		System.out.println(pushString.solution(A1, B1));
		System.out.println(pushString.solution(A2, B2));
	}

}

package ch01;

import java.util.*;

public class ArrayList_StringTokenizer {
	
	public static String[] solution(String[] quiz) {
        String[] answer = {};
        answer = new String[quiz.length];
        ArrayList<String>[] arrList = new ArrayList[quiz.length];
        for(int i=0; i<quiz.length; i++) {
        	arrList[i] = new ArrayList<String>();
        }

        StringTokenizer st;        
        for(int i=0; i<quiz.length; i++) {
        	st = new StringTokenizer(quiz[i]);
        	while(st.hasMoreTokens()) {
        		arrList[i].add(st.nextToken());
        	}
        }
        
        for(int i=0; i<quiz.length; i++) {
        	int x = Integer.parseInt(arrList[i].get(0));
        	int y = Integer.parseInt(arrList[i].get(2));
        	int z = Integer.parseInt(arrList[i].get(4));
        	
        	if(arrList[i].get(1).equals("-")) {
        		answer[i] = x-y == z ? "O" : "X";
        	}else if(arrList[i].get(1).equals("+")) {
        		answer[i] = x+y == z ? "O" : "X";
        	}
        }
        
        return answer;
    }

	public static void main(String[] args) {
		String[] quiz1 = {"3 - 4 = -3", "5 + 6 = 11"};
		String[] quiz2 = {"19 - 6 = 13", "5 + 66 = 71", "5 - 15 = 63", "3 - 1 = 2"};
		
		System.out.println(Arrays.toString(solution(quiz1)));
		System.out.println(Arrays.toString(solution(quiz2)));
	}

}

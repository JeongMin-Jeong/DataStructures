package ch04_stack;

import java.util.*;

public class CtrlZ {
	public static int solution(String s) {
        int answer = 0;
        
        String[] arr = s.split(" ");
        Stack<Integer> st = new Stack<>();
        for(int i=0; i<arr.length; i++) {
        	if(arr[i].equals("Z")) {
        		if(st.size() >= 1) {
        			st.pop();
        		}
        	}else {
        		st.push(Integer.parseInt(arr[i]));
        	}
        }
        while(st.size() != 0) {
        	answer += st.pop();
        }
        
        return answer;
    }
	
	public static void main(String[] args) {
		String s1 = "1 2 Z 3";
		String s2 = "10 20 30 40";
		String s3 = "10 Z 20 Z 1";
		String s4 = "1 1 1 1 Z Z 1 1 Z Z Z Z Z Z 1";
		
		System.out.println(solution(s1));
		System.out.println(solution(s2));
		System.out.println(solution(s3));
		System.out.println(solution(s4));
	}

}

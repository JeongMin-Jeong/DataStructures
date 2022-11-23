package ch04_Stack;

import java.util.*;

public class StackMethod {
/* Stack : 후입선출(LIFO)
 */
	public static void main(String[] args) {
		Stack<Integer> st = new Stack<Integer>();	// 스택의 생성
		
		// push() 메소드를 이용한 요소의 저장
		st.push(4);
		st.push(2);
		st.push(3);
		st.push(1);
		
		// peek() 메소드를 이용한 요소의 반환
		System.out.println(st.peek());
		System.out.println(st);
		
		// pop() 메소드를 이용한 요소의 반환 및 제거
		System.out.println(st.pop());
		System.out.println(st);
		
		// search() 메소드를 이용한 요소의 위치 검색
		System.out.println(st.search(4));
		System.out.println(st.search(3));
	}

}

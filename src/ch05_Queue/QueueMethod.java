package ch05_queue;

import java.util.*;

public class QueueMethod {
/* Queue : 선입선출(FIFO)
 */
	public static void main(String[] args) {
		Queue<String> qu = new LinkedList<>();	// 큐의 생성
		
		// add() 메소드를 이용한 요소의 저장
		qu.add("넷");
		qu.add("둘");
		qu.add("셋");
		qu.add("하나");
		
		// peek() 메소드를 이용한 요소의 반환
		System.out.println(qu.peek());
		System.out.println(qu);
		
		// poll() 메소드를 이용한 요소의 반환 및 제거
		System.out.println(qu.poll());
		System.out.println(qu);
		
		// remove() 메소드를 이용한 요소의 제거
		qu.remove("하나");
		System.out.println(qu);
		
		// element() 메소드를 이용한 큐의 맨 앞에 있는 요소의 반환
		System.out.println(qu.element());
	}

}

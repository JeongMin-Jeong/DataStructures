package ch04_stack;

import java.util.*;

public class StackMethod {
/* Stack : ���Լ���(LIFO)
 */
	public static void main(String[] args) {
		Stack<Integer> st = new Stack<>();	// ������ ����
		
		// push() �޼ҵ带 �̿��� ����� ����
		st.push(4);
		st.push(2);
		st.push(3);
		st.push(1);
		
		// peek() �޼ҵ带 �̿��� ����� ��ȯ
		System.out.println(st.peek());
		System.out.println(st);
		
		// pop() �޼ҵ带 �̿��� ����� ��ȯ �� ����
		System.out.println(st.pop());
		System.out.println(st);
		
		// search() �޼ҵ带 �̿��� ����� ��ġ �˻�
		System.out.println(st.search(4));
		System.out.println(st.search(3));
	}

}

package ch05_queue;

import java.util.*;

public class QueueMethod {
/* Queue : ���Լ���(FIFO)
 */
	public static void main(String[] args) {
		Queue<String> qu = new LinkedList<>();	// ť�� ����
		
		// add() �޼ҵ带 �̿��� ����� ����
		qu.add("��");
		qu.add("��");
		qu.add("��");
		qu.add("�ϳ�");
		
		// peek() �޼ҵ带 �̿��� ����� ��ȯ
		System.out.println(qu.peek());
		System.out.println(qu);
		
		// poll() �޼ҵ带 �̿��� ����� ��ȯ �� ����
		System.out.println(qu.poll());
		System.out.println(qu);
		
		// remove() �޼ҵ带 �̿��� ����� ����
		qu.remove("�ϳ�");
		System.out.println(qu);
		
		// element() �޼ҵ带 �̿��� ť�� �� �տ� �ִ� ����� ��ȯ
		System.out.println(qu.element());
	}

}

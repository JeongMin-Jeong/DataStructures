package ch03_List;

import java.util.*;

public class LinkedListMethod {
/* ListƯ¡ : ������� ���� / �ߺ����� ���
 * LinkedListƯ¡ : �˻� ���� O(n) / �߰�,���� ���� O(1)
 */
	public static void main(String[] args) {
		List<Integer> lnkList = new LinkedList<>();
		
		// add() �޼ҵ带 �̿��� ����� ����
		lnkList.add(40);
		lnkList.add(20);
		lnkList.add(30);
		lnkList.add(10);
		
		// for ���� get() �޼ҵ带 �̿��� ����� ���
		for (int i=0; i<lnkList.size(); i++) {
			System.out.print(lnkList.get(i) + " ");
		}
		System.out.println();
		
		// remove() �޼ҵ带 �̿��� ����� ����
		lnkList.remove(1);
		
		// Enhanced for ���� get() �޼ҵ带 �̿��� ����� ���
		for (int e : lnkList) {
			System.out.print(e + " ");
		}
		System.out.println();
		
		// Collections.sort() �޼ҵ带 �̿��� ����� ����
		Collections.sort(lnkList);
		
		// iterator() �޼ҵ� �̿��� ����� ���
		Iterator<Integer> iter = lnkList.iterator();
		while (iter.hasNext()) {
			System.out.print(iter.next() + " ");
		}
		System.out.println();
		
		// set() �޼ҵ带 �̿��� ����� ����
		lnkList.set(0, 20);

		for (int e : lnkList) {
			System.out.print(e + " ");
		}
		System.out.println();
		
		// size() �޼ҵ带 �̿��� ����� �� ����
		System.out.println("����Ʈ�� ũ�� : " + lnkList.size());
	}

}

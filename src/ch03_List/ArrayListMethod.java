package ch03_List;

import java.util.*;

public class ArrayListMethod {

	public static void main(String[] args) {
		List<Integer> arrList = new ArrayList<>();
		
		// add() �޼ҵ带 �̿��� ����� ����
		arrList.add(40);
		arrList.add(20);
		arrList.add(30);
		arrList.add(10);
		
		// for ���� get() �޼ҵ带 �̿��� ����� ���
		for (int i=0; i<arrList.size(); i++) {
			System.out.print(arrList.get(i) + " ");
		}
		System.out.println();
		
		// remove() �޼ҵ带 �̿��� ����� ����
		arrList.remove(1);
		
		// Enhanced for ���� get() �޼ҵ带 �̿��� ����� ���
		for (int e : arrList) {
			System.out.print(e + " ");
		}
		System.out.println();
		
		// Collections.sort() �޼ҵ带 �̿��� ����� ����
		Collections.sort(arrList);
		
		// iterator() �޼ҵ�� get() �޼ҵ带 �̿��� ����� ���
		Iterator<Integer> iter = arrList.iterator();
		while (iter.hasNext()) {
			System.out.print(iter.next() + " ");
		}
		System.out.println();

		// set() �޼ҵ带 �̿��� ����� ����
		arrList.set(0, 20);

		for (int e : arrList) {
			System.out.print(e + " ");
		}
		System.out.println();
		
		// size() �޼ҵ带 �̿��� ����� �� ����
		System.out.println("����Ʈ�� ũ�� : " + arrList.size());
	}

}
package ch03_List;

import java.util.*;

public class LinkedListMethod {

	public static void main(String[] args) {
		List<String> lnkList = new LinkedList<>();
		
		// add() �޼ҵ带 �̿��� ����� ����
		lnkList.add("��");
		lnkList.add("��");
		lnkList.add("��");
		lnkList.add("�ϳ�");
		
		// for ���� get() �޼ҵ带 �̿��� ����� ���
		for (int i=0; i<lnkList.size(); i++) {
			System.out.print(lnkList.get(i) + " ");
		}
		System.out.println();
		
		// remove() �޼ҵ带 �̿��� ����� ����
		lnkList.remove(1);
		
		// Enhanced for ���� get() �޼ҵ带 �̿��� ����� ���
		for (String e : lnkList) {
			System.out.print(e + " ");
		}
		System.out.println();

		// set() �޼ҵ带 �̿��� ����� ����
		lnkList.set(2, "��");

		for (String e : lnkList) {
			System.out.print(e + " ");
		}
		System.out.println();
		
		// size() �޼ҵ带 �̿��� ����� �� ����
		System.out.println("����Ʈ�� ũ�� : " + lnkList.size());
	}

}

package ch06_Set;

import java.util.*;

public class HashSetMethod {
/* HashSet Ư¡ : ������� ����X / �ߺ����� ���X
 */
	public static void main(String[] args) {
		Set<String> hs01 = new HashSet<String>();
		Set<String> hs02 = new HashSet<String>();
		
		// add() �޼ҵ带 �̿��� ����� ����
		hs01.add("ȫ�浿");
		hs01.add("�̼���");
		System.out.println(hs01.add("�Ӳ���")); // �ߺ����� ���� ����� ����, ����ǰ� true�� ��ȯ
		System.out.println(hs01.add("�Ӳ���")); // �ߺ��� ����� ����, ������� �ʰ� false�� ��ȯ
		
		// Enhanced for ���� get() �޼ҵ带 �̿��� ����� ���
		for (String e : hs01) {
			System.out.print(e + " ");
		}
		System.out.println();
		
		// add() �޼ҵ带 �̿��� ����� ����
		hs02.add("�Ӳ���");
		hs02.add("ȫ�浿");
		hs02.add("�̼���");
		
		// iterator() �޼ҵ带 �̿��� ����� ���
		Iterator<String> iter02 = hs02.iterator();
		while (iter02.hasNext()) {
			System.out.print(iter02.next() + " ");
		}
		System.out.println();

		// size() �޼ҵ带 �̿��� ����� �� ����
		System.out.println("������ ũ�� : " + hs02.size());
	}

}

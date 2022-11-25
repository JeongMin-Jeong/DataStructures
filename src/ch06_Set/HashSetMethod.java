package ch06_set;

import java.util.*;

public class HashSetMethod {
/* HashSet Ư¡ : ������� ����X / �ߺ����� ���X
 * LinkedHashSet Ư¡ : ������� ����O / �ߺ����� ���X
 * ����Ư¡ : index�̿��ؼ� Ư�� ��� get�Ұ�. toArray �̿��ؼ� Integer[] �� ��ȯ�ϸ� Ư�� ��� ����
 */
	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<>();
		HashSet<String> hs2 = new HashSet<>();
		
		// add() �޼ҵ带 �̿��� ����� ����
		hs.add("ȫ�浿");
		hs.add("�̼���");
		System.out.println(hs.add("�Ӳ���")); // �ߺ����� ���� ����� ����, ����ǰ� true�� ��ȯ
		System.out.println(hs.add("�Ӳ���")); // �ߺ��� ����� ����, ������� �ʰ� false�� ��ȯ
		hs2.add("�Ӳ���");
		hs2.add("ȫ�浿");
		hs2.add("�̼���");
		
		// Enhanced for ���� get() �޼ҵ带 �̿��� ����� ���
		for (String e : hs) {
			System.out.print(e + " ");
		}
		System.out.println();
		for (String e : hs2) {
			System.out.print(e + " ");
		}
		System.out.println();
		// size() �޼ҵ带 �̿��� ����� �� ����
		System.out.println("size() : " + hs.size());
		System.out.println("contains() : " + hs.contains("�Ӳ���"));
		System.out.println("remove() : " + hs.remove("�Ӳ���"));
		System.out.println("isEmpty() : " + hs.isEmpty());
		System.out.println("========1========");

		// LinkedHashSet�� ���� ���� �����Ǹ鼭 �ߺ�����ȵ�
		HashSet<String> lhs01 = new LinkedHashSet<>();
		HashSet<String> lhs02 = new LinkedHashSet<>();
		
		for(String str : hs) {
			lhs01.add(str);
		}
		lhs02.add("�Ӳ���");
		lhs02.add("ȫ�浿");
		lhs02.add("�̼���");
		lhs02.add("�̼���"); // �ߺ�����ȵ�
		
		// Enhanced for ���� get() �޼ҵ带 �̿��� ����� ���
		for (String e : lhs01) {
			System.out.print(e + " ");
		}
		System.out.println();
		for (String e : lhs02) {
			System.out.print(e + " ");
		}
		System.out.println();
		System.out.println("========2========");
		
		// toArray() �޼ҵ带 �̿��Ͽ� Set -> �迭�� ��ȯ
		String[] arr = new String[lhs02.size()];
		arr = lhs02.toArray(new String[0]); // �迭�� ũ�⸦ 0���� �����ϸ� �ڵ����� �迭�� ũ�Ⱑ ����
		System.out.println(Arrays.toString(arr));

	}

}

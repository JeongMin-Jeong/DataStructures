package ch07_map;

import java.util.*;

public class HashMapMethod {
/* HashMap Ư¡ : K-V ������� ����
 * ������� ����X / �ߺ�Key ���� ���X / �ߺ�Value ���� ���
 */
	public static void main(String[] args) {
		HashMap<String, Integer> hm = new HashMap<>();
		
		// put() �޼ҵ带 �̿��� ����� ����
		hm.put("���", 30);
		hm.put("��", 10);
		hm.put("���", 40);
		hm.put("����", hm.getOrDefault("����", 20)); // Key�� �ش��ϴ� Value�� ������ ��������, �ƴ� ��� 0�� Default�� �����Ͽ� ����ϰڴ�
		hm.put("����", hm.getOrDefault("����", 30) + 50); 
		//hm.put("�̽�", 20);
		System.out.println(hm.put("�̽�", 20)); // �ߺ����� ���� Key�� ����, ����ǰ� null�� ��ȯ
		System.out.println(hm.put("�̽�", 30)); // �ߺ��� Key�� ����, Value�� ���� ����ǰ�, ������ Value�� ��ȯ
		System.out.println("========1========");
		// ���
		System.out.println("�ʿ� ����� Ű���� ���� : " + hm.keySet());
		System.out.println("�ʿ� ����� ������ ���� : " + hm.values());
		for (String key : hm.keySet()) {
			System.out.println(String.format("Ű : %s, �� : %s", key, hm.get(key)));
		}
		System.out.println("========2========");
		// ������ Űã��
		for(String key : hm.keySet()) {
		    // Ű�� ���ε� ���̶� equals() �޼��忡 ���޵� ���̶� ��ġ�ϸ� �ݺ����� �����մϴ�.
		    if(hm.get(key).equals(40)) { // Ű�� null�̸� NullPointerException ���� �߻�
		      System.out.println("������ Űã�� : " + key);
		      break;
		    }
		}
		System.out.println("========3========");
		// remove() Ű�� ����, ������ ���� �Ұ�
		hm.remove("���");
		// replace() �޼ҵ带 �̿��� ����� ����
		hm.replace("�̽�", 200);

		for (String key : hm.keySet()) {
			System.out.println(String.format("Ű : %s, �� : %s", key, hm.get(key)));
		}
		System.out.println("========4========");
		// size() �޼ҵ带 �̿��� ����� �� ����
		System.out.println("size() : " + hm.size());
		// containsKey() �޼ҵ带 �̿��� Key���� ����
		System.out.println("containsKey() : " + hm.containsKey("�̽�"));
		// containsValue() �޼ҵ带 �̿��� Value���� ����
		System.out.println("containsValue() : " + hm.containsValue("100"));
		// isEmpty() �޼ҵ带 �̿��� HashMap�� ������� Ȯ��
		System.out.println("isEmpty() : " + hm.isEmpty());
	}

}

package ch07_Map;

import java.util.*;

public class HashMapMethod {
/* HashMap Ư¡ : K-V ������� ����
 * ������� ����X / �ߺ�Key ���� ���X / �ߺ�Value ���� ���
 */
	public static void main(String[] args) {
		Map<String, Integer> hm = new HashMap<String, Integer>();
		
		// put() �޼ҵ带 �̿��� ����� ����
		hm.put("���", 30);
		hm.put("��", 10);
		hm.put("���", 40);
		//hm.put("�̽�", 20);
		System.out.println(hm.put("�̽�", 20)); // �ߺ����� ���� Key�� ����, ����ǰ� null�� ��ȯ
		System.out.println(hm.put("�̽�", 30)); // �ߺ��� Key�� ����, Value�� ���� ����ǰ�, ������ Value�� ��ȯ

		// Enhanced for ���� get() �޼ҵ带 �̿��� ����� ���
		System.out.println("�ʿ� ����� Ű���� ���� : " + hm.keySet());
		for (String key : hm.keySet()) {
			System.out.println(String.format("Ű : %s, �� : %s", key, hm.get(key)));
		}
		System.out.println();
		
		System.out.println("�ʿ� ����� ������ ���� : " + hm.values());
		for(String key : hm.keySet()) {
		    // Ű�� ���ε� ���̶� equals() �޼��忡 ���޵� ���̶� ��ġ�ϸ� �ݺ����� �����մϴ�.
		    if(hm.get(key).equals(40)) { // Ű�� null�̸� NullPointerException ���� �߻�
		      System.out.println("������ Űã�� : " + key);
		      break;
		    }
		}
		System.out.println();

		// remove() �޼ҵ带 �̿��� ����� ����
		hm.remove("���");

		// iterator() �޼ҵ�� get() �޼ҵ带 �̿��� ����� ���
		Iterator<String> keys = hm.keySet().iterator();
		while (keys.hasNext()) {
			String key = keys.next();
			System.out.println(String.format("Ű : %s, �� : %s", key, hm.get(key)));
		}
		System.out.println();

		// replace() �޼ҵ带 �̿��� ����� ����
		hm.replace("�̽�", 200);

		for (String key : hm.keySet()) {
			System.out.println(String.format("Ű : %s, �� : %s", key, hm.get(key)));
		}
		System.out.println();

		// size() �޼ҵ带 �̿��� ����� �� ����
		System.out.println("���� ũ�� : " + hm.size());
		
		// containsKey() �޼ҵ带 �̿��� Key���� ����
		System.out.println(hm.containsKey("�̽�"));
		
		// containsValue() �޼ҵ带 �̿��� Value���� ����
		System.out.println(hm.containsValue("100"));
		
		// isEmpty() �޼ҵ带 �̿��� HashMap�� ������� Ȯ��
		System.out.println(hm.isEmpty());
	}

}

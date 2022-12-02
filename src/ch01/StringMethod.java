package ch01;

import java.util.Arrays;

public class StringMethod {

	public static void main(String[] args) {
		String s1 = "aabcDEF";
		String s = " 123 567 ";
		System.out.println(s1);
		System.out.println(s);
		System.out.println("============");
		// 1. equls
		System.out.println("equals(\"abcDEF\") :" + s1.equals("abcDEF"));
		// 2. length
		System.out.println("length() :" + s1.length());
		// 3. toUpperCase / toLowerCase
		System.out.println("toUpperCase() :" + s1.toUpperCase());
		System.out.println("toLowerCase() :" + s1.toLowerCase());
		// 4. indexOf : �����ϸ� �����ε����� ��ȯ, �������� ������ -1�� ��ȯ
		System.out.println("s1.indexOf(\"D\") :" + s1.indexOf("D")); 
		System.out.println("s1.indexOf(\"d\") :" + s1.indexOf("d")); 
		// 5. substring : string�� �Ϻθ� ����
		System.out.println("s.substring(2) :" + s.substring(2));
		System.out.println("s.substring(2,5) :" + s.substring(2,5)); 
		// 6. replace : ���ڿ��� �Ϻθ� ã�Ƽ� ��ü
		System.out.println("replace(\"a\", \"1\") :" + s1.replace("a", "1"));
		System.out.println("replaceAll(\"[^0-9]\", \"\") :" + s.replaceAll("[^0-9]", ""));
		// 7. trim : �յ� ������ ����
		System.out.println("trim() :" + s.trim());
		// 9. compareTo : �� ���ڿ��� ASCII ���� ��, ���ĺ� ���� ��
		System.out.println("compareTo ���� �ں��� ���̸� : " + "b".compareTo("c"));
		System.out.println("compareTo ���� �ڶ� ������ : " + "b".compareTo("b"));
		System.out.println("compareTo ���� �ں��� ���̸� : " + "b".compareTo("a"));
		System.out.println("compareTo ��ҹ��� �ٸ��� : " + "b".compareTo("B"));
		// 10. �߰� : split, contains, charAt, startsWith, endsWith
		// "Hello".contains("l") == "Hello".indexOf("l") != -1
		// "Hello".charAt(2) == "Hello".substring(2,3)
		System.out.println("Arrays.toString(s.split(\" \") :" + Arrays.toString(s.split(" ")));
	}

}

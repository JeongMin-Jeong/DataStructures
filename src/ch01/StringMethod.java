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
		// 4. indexOf : 존재하면 시작인덱스를 반환, 존재하지 않으면 -1을 반환
		System.out.println("s1.indexOf(\"D\") :" + s1.indexOf("D")); 
		System.out.println("s1.indexOf(\"d\") :" + s1.indexOf("d")); 
		// 5. substring : string의 일부를 추출
		System.out.println("s.substring(2) :" + s.substring(2));
		System.out.println("s.substring(2,5) :" + s.substring(2,5)); 
		// 6. replace : 문자열의 일부를 찾아서 대체
		System.out.println("replace(\"a\", \"1\") :" + s1.replace("a", "1"));
		System.out.println("replaceAll(\"[^0-9]\", \"\") :" + s.replaceAll("[^0-9]", ""));
		// 7. trim : 앞뒤 공백을 제거
		System.out.println("trim() :" + s.trim());
		// 9. compareTo : 두 문자열의 ASCII 순서 비교, 알파벳 순서 비교
		System.out.println("compareTo 앞이 뒤보다 앞이면 : " + "b".compareTo("c"));
		System.out.println("compareTo 앞이 뒤랑 같으면 : " + "b".compareTo("b"));
		System.out.println("compareTo 앞이 뒤보다 뒤이면 : " + "b".compareTo("a"));
		System.out.println("compareTo 대소문자 다르문 : " + "b".compareTo("B"));
		// 10. 추가 : split, contains, charAt, startsWith, endsWith
		// "Hello".contains("l") == "Hello".indexOf("l") != -1
		// "Hello".charAt(2) == "Hello".substring(2,3)
		System.out.println("Arrays.toString(s.split(\" \") :" + Arrays.toString(s.split(" ")));
	}

}

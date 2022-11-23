package ch06_Set;

import java.util.*;

public class HashSetMethod {
/* HashSet 특징 : 저장순서 유지X / 중복저장 허용X
 */
	public static void main(String[] args) {
		Set<String> hs01 = new HashSet<String>();
		Set<String> hs02 = new HashSet<String>();
		
		// add() 메소드를 이용한 요소의 저장
		hs01.add("홍길동");
		hs01.add("이순신");
		System.out.println(hs01.add("임꺽정")); // 중복되지 않은 요소의 저장, 저장되고 true를 반환
		System.out.println(hs01.add("임꺽정")); // 중복된 요소의 저장, 저장되지 않고 false를 반환
		
		// Enhanced for 문과 get() 메소드를 이용한 요소의 출력
		for (String e : hs01) {
			System.out.print(e + " ");
		}
		System.out.println();
		
		// add() 메소드를 이용한 요소의 저장
		hs02.add("임꺽정");
		hs02.add("홍길동");
		hs02.add("이순신");
		
		// iterator() 메소드를 이용한 요소의 출력
		Iterator<String> iter02 = hs02.iterator();
		while (iter02.hasNext()) {
			System.out.print(iter02.next() + " ");
		}
		System.out.println();

		// size() 메소드를 이용한 요소의 총 개수
		System.out.println("집합의 크기 : " + hs02.size());
	}

}

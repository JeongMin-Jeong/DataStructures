package ch06_set;

import java.util.*;

public class HashSetMethod {
/* HashSet 특징 : 저장순서 유지X / 중복저장 허용X
 * LinkedHashSet 특징 : 저장순서 유지O / 중복저장 허용X
 * 공통특징 : index이용해서 특정 요소 get불가. toArray 이용해서 Integer[] 로 전환하면 특정 요소 추출
 */
	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<>();
		HashSet<String> hs2 = new HashSet<>();
		
		// add() 메소드를 이용한 요소의 저장
		hs.add("홍길동");
		hs.add("이순신");
		System.out.println(hs.add("임꺽정")); // 중복되지 않은 요소의 저장, 저장되고 true를 반환
		System.out.println(hs.add("임꺽정")); // 중복된 요소의 저장, 저장되지 않고 false를 반환
		hs2.add("임꺽정");
		hs2.add("홍길동");
		hs2.add("이순신");
		
		// Enhanced for 문과 get() 메소드를 이용한 요소의 출력
		for (String e : hs) {
			System.out.print(e + " ");
		}
		System.out.println();
		for (String e : hs2) {
			System.out.print(e + " ");
		}
		System.out.println();
		// size() 메소드를 이용한 요소의 총 개수
		System.out.println("size() : " + hs.size());
		System.out.println("contains() : " + hs.contains("임꺽정"));
		System.out.println("remove() : " + hs.remove("임꺽정"));
		System.out.println("isEmpty() : " + hs.isEmpty());
		System.out.println("========1========");

		// LinkedHashSet은 저장 순서 유지되면서 중복저장안됨
		HashSet<String> lhs01 = new LinkedHashSet<>();
		HashSet<String> lhs02 = new LinkedHashSet<>();
		
		for(String str : hs) {
			lhs01.add(str);
		}
		lhs02.add("임꺽정");
		lhs02.add("홍길동");
		lhs02.add("이순신");
		lhs02.add("이순신"); // 중복저장안됨
		
		// Enhanced for 문과 get() 메소드를 이용한 요소의 출력
		for (String e : lhs01) {
			System.out.print(e + " ");
		}
		System.out.println();
		for (String e : lhs02) {
			System.out.print(e + " ");
		}
		System.out.println();
		System.out.println("========2========");
		
		// toArray() 메소드를 이용하여 Set -> 배열로 전환
		String[] arr = new String[lhs02.size()];
		arr = lhs02.toArray(new String[0]); // 배열의 크기를 0으로 지정하면 자동으로 배열의 크기가 지정
		System.out.println(Arrays.toString(arr));

	}

}

package ch03_list;

import java.util.*;

public class ArrayListMethod {
/* List특징 : 저장순서 유지 / 중복저장 허용
 * ArrayList특징 : 검색 빠름 O(1) / 추가,삭제 느림 O(n)
 */
	public static void main(String[] args) {
		ArrayList<Integer> arrList = new ArrayList<>();
		
		// add() 메소드를 이용한 요소의 저장
		arrList.add(40);
		arrList.add(20);
		arrList.add(30);
		arrList.add(10);
		
		// for 문과 get() 메소드를 이용한 요소의 출력
		for (int i=0; i<arrList.size(); i++) {
			System.out.print(arrList.get(i) + " ");
		}
		System.out.println();
		
		// remove() 메소드를 이용한 요소의 제거
		arrList.remove(1);
		
		// Enhanced for 문과 get() 메소드를 이용한 요소의 출력
		for (int e : arrList) {
			System.out.print(e + " ");
		}
		System.out.println();
		
		// Collections.sort() 메소드를 이용한 요소의 정렬
		Collections.sort(arrList);
		
		// iterator() 메소드 이용한 요소의 출력
		Iterator<Integer> iter = arrList.iterator();
		while (iter.hasNext()) {
			System.out.print(iter.next() + " ");
		}
		System.out.println();

		// set() 메소드를 이용한 요소의 변경
		arrList.set(0, 20);

		for (int e : arrList) {
			System.out.print(e + " ");
		}
		System.out.println();
		
		// size() 메소드를 이용한 요소의 총 개수
		System.out.println("리스트의 크기 : " + arrList.size());
		System.out.println("contains(20) : " + arrList.contains(20));
	}

}

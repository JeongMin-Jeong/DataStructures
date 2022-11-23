package ch03_List;

import java.util.*;

public class LinkedListMethod {
/* List특징 : 저장순서 유지 / 중복저장 허용
 * LinkedList특징 : 검색 느림 O(n) / 추가,삭제 빠름 O(1)
 */
	public static void main(String[] args) {
		List<Integer> lnkList = new LinkedList<>();
		
		// add() 메소드를 이용한 요소의 저장
		lnkList.add(40);
		lnkList.add(20);
		lnkList.add(30);
		lnkList.add(10);
		
		// for 문과 get() 메소드를 이용한 요소의 출력
		for (int i=0; i<lnkList.size(); i++) {
			System.out.print(lnkList.get(i) + " ");
		}
		System.out.println();
		
		// remove() 메소드를 이용한 요소의 제거
		lnkList.remove(1);
		
		// Enhanced for 문과 get() 메소드를 이용한 요소의 출력
		for (int e : lnkList) {
			System.out.print(e + " ");
		}
		System.out.println();
		
		// Collections.sort() 메소드를 이용한 요소의 정렬
		Collections.sort(lnkList);
		
		// iterator() 메소드 이용한 요소의 출력
		Iterator<Integer> iter = lnkList.iterator();
		while (iter.hasNext()) {
			System.out.print(iter.next() + " ");
		}
		System.out.println();
		
		// set() 메소드를 이용한 요소의 변경
		lnkList.set(0, 20);

		for (int e : lnkList) {
			System.out.print(e + " ");
		}
		System.out.println();
		
		// size() 메소드를 이용한 요소의 총 개수
		System.out.println("리스트의 크기 : " + lnkList.size());
	}

}

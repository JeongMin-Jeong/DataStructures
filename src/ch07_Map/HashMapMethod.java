package ch07_map;

import java.util.*;

public class HashMapMethod {
/* HashMap 특징 : K-V 방식으로 저장
 * 저장순서 유지X / 중복Key 저장 허용X / 중복Value 저장 허용
 */
	public static void main(String[] args) {
		HashMap<String, Integer> hm = new HashMap<>();
		
		// put() 메소드를 이용한 요소의 저장
		hm.put("삼십", 30);
		hm.put("십", 10);
		hm.put("사십", 40);
		hm.put("육십", hm.getOrDefault("육십", 20)); // Key에 해당하는 Value가 있으면 가져오고, 아닐 경우 0을 Default로 지정하여 사용하겠다
		hm.put("육십", hm.getOrDefault("육십", 30) + 50); 
		//hm.put("이십", 20);
		System.out.println(hm.put("이십", 20)); // 중복되지 않은 Key의 저장, 저장되고 null를 반환
		System.out.println(hm.put("이십", 30)); // 중복된 Key의 저장, Value가 새로 저장되고, 이전의 Value를 반환
		System.out.println("========1========");
		// 출력
		System.out.println("맵에 저장된 키들의 집합 : " + hm.keySet());
		System.out.println("맵에 저장된 값들의 집합 : " + hm.values());
		for (String key : hm.keySet()) {
			System.out.println(String.format("키 : %s, 값 : %s", key, hm.get(key)));
		}
		System.out.println("========2========");
		// 값으로 키찾기
		for(String key : hm.keySet()) {
		    // 키와 매핑된 값이랑 equals() 메서드에 전달된 값이랑 일치하면 반복문을 종료합니다.
		    if(hm.get(key).equals(40)) { // 키가 null이면 NullPointerException 예외 발생
		      System.out.println("값으로 키찾기 : " + key);
		      break;
		    }
		}
		System.out.println("========3========");
		// remove() 키만 가능, 값으로 제거 불가
		hm.remove("사십");
		// replace() 메소드를 이용한 요소의 수정
		hm.replace("이십", 200);

		for (String key : hm.keySet()) {
			System.out.println(String.format("키 : %s, 값 : %s", key, hm.get(key)));
		}
		System.out.println("========4========");
		// size() 메소드를 이용한 요소의 총 개수
		System.out.println("size() : " + hm.size());
		// containsKey() 메소드를 이용한 Key존재 유무
		System.out.println("containsKey() : " + hm.containsKey("이십"));
		// containsValue() 메소드를 이용한 Value존재 유무
		System.out.println("containsValue() : " + hm.containsValue("100"));
		// isEmpty() 메소드를 이용한 HashMap이 비었는지 확인
		System.out.println("isEmpty() : " + hm.isEmpty());
	}

}

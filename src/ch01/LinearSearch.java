package ch01;

public class LinearSearch {

	public static void main(String[] args) {
		int[] arr = {3,5,2,4,9};
		int idx;
		
		idx = LSearch(arr, arr.length, 4);
		if(idx == -1) {
			System.out.println("탐색실패");
		}
		else {
			System.out.println("타겟 저장 인덱스: " + idx);
		}
		
		idx = LSearch(arr, arr.length, 7);
		if(idx == -1) {
			System.out.println("탐색실패");
		}
		else {
			System.out.println("타겟 저장 인덱스: " + idx);
		} 
	}
	
	public static int LSearch(int[] arr, int len, int target) { // 순차 탐색 알고리즘 적용된 함수
		int i;
		for(i=0; i<len; i++) {
			if(arr[i] == target) {
				return i; // 찾은 대상의 인덱스값 반환
			}
		}
		return -1; // 찾지 못했음을 의미하는 값 변환
	}

}

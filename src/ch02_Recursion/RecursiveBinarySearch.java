package ch02_Recursion;

public class RecursiveBinarySearch {
/* 이진탐색 알고리즘의 재귀적 구현
 * [이진탐색 알고리즘의 반복패턴]
 * 1. 탐색 범위의 중앙에 목표 값이 저장되었는지 확인
 * 2. 저장되지 않았다면 탐색 범위를 반으로 줄여서 다시 탐색 시작
 * [재귀함수의 탈출조건]
 * 1. 탐색 대상을 찾음
 * 2. 탐색 대상이 배열에 존재하지 않음(first가 last보다 커지는 경우)
 */
	public static int BSearch(int[] arr, int first, int last, int target) {
		int mid;
		if(first > last) {
			return -1; // -1의 반환은 탐색의 실패를 의미
		}
		
		mid = (first+last)/2; // 탐색대상의 중앙을 찾는다.
		if(arr[mid] == target) {
			return mid; // 탐색된 타겟의 인덱스 값 반환
		}
		else if(target < arr[mid]) {
			return BSearch(arr, first, mid-1, target);
		}
		else {
			return BSearch(arr, mid+1, last, target);
		}
	}
	
	public static void main(String[] args) {
		int[] arr = {1,3,5,7,9};
		int idx;
		
		idx = BSearch(arr, 0, arr.length, 7);
		if(idx == -1) {
			System.out.println("탐색 실패");
		}
		else {
			System.out.println("타겟 저장 인덱스 : " + idx);
		}
		
		idx = BSearch(arr, 0, arr.length, 4);
		if(idx == -1) {
			System.out.println("탐색 실패");
		}
		else {
			System.out.println("타겟 저장 인덱스 : " + idx);
		}
	}
	
}

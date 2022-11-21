package ch01;

public class BinarySearch {
	public static void main(String[] args) {
		int[] arr = {1,3,5,7,9};
		int idx;
		
		idx = BSearch(arr, arr.length, 7);
		if(idx == -1) {
			System.out.println("탐색실패");
		}
		else {
			System.out.println("타겟 저장 인덱스: " + idx);
		}
		
		idx = BSearch(arr, arr.length, 4);
		if(idx == -1) {
			System.out.println("탐색실패");
		}
		else {
			System.out.println("타겟 저장 인덱스: " + idx);
		} 
	}
	
	public static int BSearch(int[] arr, int len, int target) {
		int first = 0; // 탐색 대상의 시작 인덱스 값
		int last = len - 1; // 탐색 대상의 마지막 인덱스 값
		int mid;
		
		while(first <= last) { // first가 last보다 큰 경우 탐색은 종료된다. 그리고 이렇게 종료가 되었다는 것은 탐색에 실패했음을 뜻한다.
			mid = (first + last)/2; // 탐색 대상의 중앙을 찾는다.
			
			if(target == arr[mid]) { // 중앙에 저장된 것이 타겟이라면
				return mid; // 탐색 완료!
			}
			else { // 타겟이 아니라면 탐색 대상을 반으로 줄인다.
				if(target < arr[mid]) {
					last = mid - 1;
				}
				else {
					first = mid + 1;
				}
			}
		}
		
		return -1; // 찾지 못했을 때 반환되는 값 -1 
	}
}

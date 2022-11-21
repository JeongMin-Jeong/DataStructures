package ch02_Recursion;

public class RecursiveBinarySearch {
/* ����Ž�� �˰����� ����� ����
 * [����Ž�� �˰����� �ݺ�����]
 * 1. Ž�� ������ �߾ӿ� ��ǥ ���� ����Ǿ����� Ȯ��
 * 2. ������� �ʾҴٸ� Ž�� ������ ������ �ٿ��� �ٽ� Ž�� ����
 * [����Լ��� Ż������]
 * 1. Ž�� ����� ã��
 * 2. Ž�� ����� �迭�� �������� ����(first�� last���� Ŀ���� ���)
 */
	public static int BSearch(int[] arr, int first, int last, int target) {
		int mid;
		if(first > last) {
			return -1; // -1�� ��ȯ�� Ž���� ���и� �ǹ�
		}
		
		mid = (first+last)/2; // Ž������� �߾��� ã�´�.
		if(arr[mid] == target) {
			return mid; // Ž���� Ÿ���� �ε��� �� ��ȯ
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
			System.out.println("Ž�� ����");
		}
		else {
			System.out.println("Ÿ�� ���� �ε��� : " + idx);
		}
		
		idx = BSearch(arr, 0, arr.length, 4);
		if(idx == -1) {
			System.out.println("Ž�� ����");
		}
		else {
			System.out.println("Ÿ�� ���� �ε��� : " + idx);
		}
	}
	
}

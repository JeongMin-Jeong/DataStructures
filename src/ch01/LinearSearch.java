package ch01;

public class LinearSearch {

	public static void main(String[] args) {
		int[] arr = {3,5,2,4,9};
		int idx;
		
		idx = LSearch(arr, arr.length, 4);
		if(idx == -1) {
			System.out.println("Ž������");
		}
		else {
			System.out.println("Ÿ�� ���� �ε���: " + idx);
		}
		
		idx = LSearch(arr, arr.length, 7);
		if(idx == -1) {
			System.out.println("Ž������");
		}
		else {
			System.out.println("Ÿ�� ���� �ε���: " + idx);
		} 
	}
	
	public static int LSearch(int[] arr, int len, int target) { // ���� Ž�� �˰��� ����� �Լ�
		int i;
		for(i=0; i<len; i++) {
			if(arr[i] == target) {
				return i; // ã�� ����� �ε����� ��ȯ
			}
		}
		return -1; // ã�� �������� �ǹ��ϴ� �� ��ȯ
	}

}

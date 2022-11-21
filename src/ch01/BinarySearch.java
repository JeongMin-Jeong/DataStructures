package ch01;

public class BinarySearch {
	public static void main(String[] args) {
		int[] arr = {1,3,5,7,9};
		int idx;
		
		idx = BSearch(arr, arr.length, 7);
		if(idx == -1) {
			System.out.println("Ž������");
		}
		else {
			System.out.println("Ÿ�� ���� �ε���: " + idx);
		}
		
		idx = BSearch(arr, arr.length, 4);
		if(idx == -1) {
			System.out.println("Ž������");
		}
		else {
			System.out.println("Ÿ�� ���� �ε���: " + idx);
		} 
	}
	
	public static int BSearch(int[] arr, int len, int target) {
		int first = 0; // Ž�� ����� ���� �ε��� ��
		int last = len - 1; // Ž�� ����� ������ �ε��� ��
		int mid;
		
		while(first <= last) { // first�� last���� ū ��� Ž���� ����ȴ�. �׸��� �̷��� ���ᰡ �Ǿ��ٴ� ���� Ž���� ���������� ���Ѵ�.
			mid = (first + last)/2; // Ž�� ����� �߾��� ã�´�.
			
			if(target == arr[mid]) { // �߾ӿ� ����� ���� Ÿ���̶��
				return mid; // Ž�� �Ϸ�!
			}
			else { // Ÿ���� �ƴ϶�� Ž�� ����� ������ ���δ�.
				if(target < arr[mid]) {
					last = mid - 1;
				}
				else {
					first = mid + 1;
				}
			}
		}
		
		return -1; // ã�� ������ �� ��ȯ�Ǵ� �� -1 
	}
}

package ch08_dfsbfs;

public class Dfs_TargetNumber {
// dfs : ���̿켱Ž�� -> stack, ����Լ��� ��������
// ���ൿ�۰� Ż���������� ����
	int[] numbers;
	int target;
	int answer;

	// ���� �켱 Ž��
	public void dfs(int index, int sum){
		// 1. Ż������
		if(index == numbers.length) {
			if(sum == target) answer++;
			return;
		}
		
		// 2. ���ൿ��
		dfs(index + 1, sum + numbers[index]);
		dfs(index + 1, sum - numbers[index]);
	}
	
    public int solution(int[] numbers, int target) {
    	answer = 0;

    	this.numbers = numbers;
    	this.target = target;
    	dfs(0,0);
    	
    	return answer;
    }
    
    public static void main(String[] args) {
		int[] numbers1 = {1,1,1,1,1};
		int target1 = 3;
		int[] numbers2 = {4,1,2,1};
		int target2 = 4;
		
		//System.out.println(solution(numbers1, target1)); ��� 5
		//System.out.println(solution(numbers2, target2)); ��� 2
	}
}

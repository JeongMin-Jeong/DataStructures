package ch08_dfsbfs;

public class Dfs_TargetNumber {
// dfs : 깊이우선탐색 -> stack, 재귀함수로 구현가능
// 수행동작과 탈출조건으로 구성
	int[] numbers;
	int target;
	int answer;

	// 깊이 우선 탐색
	public void dfs(int index, int sum){
		// 1. 탈출조건
		if(index == numbers.length) {
			if(sum == target) answer++;
			return;
		}
		
		// 2. 수행동작
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
		
		//System.out.println(solution(numbers1, target1)); 결과 5
		//System.out.println(solution(numbers2, target2)); 결과 2
	}
}

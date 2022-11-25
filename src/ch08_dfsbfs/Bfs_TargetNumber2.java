package ch08_dfsbfs;

import java.util.*;

public class Bfs_TargetNumber2 {
// bfs : 넓이우선탐색 -> queue로 구현가능
	static int answer;

    public static int solution(int[] numbers, int target) {
    	answer = 0;
        bfs(numbers, target, 0, 0);
        return answer;
    }

    // 깊이 우선 탐색+
    public static void bfs(int[] numbers, int target, int depth, int sum){
    	Queue<int[]> qu = new LinkedList<>();
    	qu.add(new int[] {depth, sum});

    	while(!qu.isEmpty()) {
    		int[] q = qu.poll();
    		int d = q[0];
    		int s = q[1];
    		if(d == numbers.length){ // 마지막 노드 까지 탐색한 경우
    			if(target == s) answer++;
    		} else {
    			qu.add(new int[] {d+1, s+numbers[d]});
    			qu.add(new int[] {d+1, s-numbers[d]});
    		}
    	}
    }
    
    public static void main(String[] args) {
		int[] numbers1 = {1,1,1,1,1};
		int target1 = 3;
		int[] numbers2 = {4,1,2,1};
		int target2 = 4;
		
		System.out.println(solution(numbers1, target1));
		System.out.println(solution(numbers2, target2));
	}
}

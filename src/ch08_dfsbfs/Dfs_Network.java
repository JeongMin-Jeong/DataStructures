package ch08_dfsbfs;

import java.util.*;

public class Dfs_Network {
/* 
 * 네트워크란 컴퓨터 상호 간에 정보를 교환할 수 있도록 연결된 형태를 의미합니다. 예를 들어, 컴퓨터 A와 컴퓨터 B가 직접적으로 연결되어있고, 컴퓨터 B와 컴퓨터 C가 직접적으로 연결되어 있을 때 컴퓨터 A와 컴퓨터 C도 간접적으로 연결되어 정보를 교환할 수 있습니다. 따라서 컴퓨터 A, B, C는 모두 같은 네트워크 상에 있다고 할 수 있습니다.
 * 컴퓨터의 개수 n, 연결에 대한 정보가 담긴 2차원 배열 computers가 매개변수로 주어질 때, 네트워크의 개수를 return 하도록 solution 함수를 작성하시오.
 */
	static boolean[] visited;
	static ArrayList<Integer>[]	links;
	
	public static int solution(int n, int[][] computers) {
        int answer = 0;
        
        // 그래프 초기화
        visited = new boolean[n+1];
        links = new ArrayList[n+1];                               
        for(int i=1; i<=n; i++) {
        	links[i] = new ArrayList<Integer>();
        }
        
        // 그래프 데이터 입력
        for(int i=0; i<n; i++) {
        	for(int j=0; j<n; j++) {
        		if(computers[i][j] == 1) {
        			links[i+1].add(j+1);
        		}
        	}
        }
        
        // dfs
        int count = 0;
        for(int i=1; i<=n; i++) {
        	if(!visited[i]) {
        		count++;
        		dfs(i);
        	}
        }
        
        // 결과반환
        answer = count;
        return answer;
    }
	
	public static void dfs(int start) {
		visited[start] = true; // dfs수행할 때 방문처리
		for(int link : links[start]) { // 연결된 모든 노드에 대해 dfs수행
			if(!visited[link]) {
				dfs(link);
			}
		}
	}
	
	public static void main(String[] args) {
		int n1 = 3;
		int[][] computers1 = {{1, 1, 0}, {1, 1, 0}, {0, 0, 1}};
		int n2 = 3;
		int[][] computers2 = {{1, 1, 0}, {1, 1, 1}, {0, 1, 1}};
		
		System.out.println(solution(n1, computers1));
		System.out.println(solution(n2, computers2));
	}
}

package ch08_dfsbfs;

import java.util.*;

public class Dfs_Network {
/* 
 * ��Ʈ��ũ�� ��ǻ�� ��ȣ ���� ������ ��ȯ�� �� �ֵ��� ����� ���¸� �ǹ��մϴ�. ���� ���, ��ǻ�� A�� ��ǻ�� B�� ���������� ����Ǿ��ְ�, ��ǻ�� B�� ��ǻ�� C�� ���������� ����Ǿ� ���� �� ��ǻ�� A�� ��ǻ�� C�� ���������� ����Ǿ� ������ ��ȯ�� �� �ֽ��ϴ�. ���� ��ǻ�� A, B, C�� ��� ���� ��Ʈ��ũ �� �ִٰ� �� �� �ֽ��ϴ�.
 * ��ǻ���� ���� n, ���ῡ ���� ������ ��� 2���� �迭 computers�� �Ű������� �־��� ��, ��Ʈ��ũ�� ������ return �ϵ��� solution �Լ��� �ۼ��Ͻÿ�.
 */
	static boolean[] visited;
	static ArrayList<Integer>[]	links;
	
	public static int solution(int n, int[][] computers) {
        int answer = 0;
        
        // �׷��� �ʱ�ȭ
        visited = new boolean[n+1];
        links = new ArrayList[n+1];                               
        for(int i=1; i<=n; i++) {
        	links[i] = new ArrayList<Integer>();
        }
        
        // �׷��� ������ �Է�
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
        
        // �����ȯ
        answer = count;
        return answer;
    }
	
	public static void dfs(int start) {
		visited[start] = true; // dfs������ �� �湮ó��
		for(int link : links[start]) { // ����� ��� ��忡 ���� dfs����
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

package ch08_dfsbfs;

import java.util.*;

public class Bfs_GameMap {
/*
 * ���� ������ ���� �ִ� �Ÿ� ���ϱ� / �����Ұ��� ��� -1
 * ����(1,1) ����(n,m)
 * 0�� 1��
 */
	static int[] dx = {-1,1,0,0};
 	static int[] dy = {0,0,-1,1};
 	static boolean[][] visited;
 	
	static class Player{
		int x,y,distance;

		public Player(int x, int y, int distance) {
			this.x = x;
			this.y = y;
			this.distance = distance;
		}
	}
	
	static int bfs(Player player, int[][] maps) {
		Queue<Player> qu = new LinkedList<Player>();
		qu.add(player);
		
		while(!qu.isEmpty()) {
			Player p = qu.poll();
			int x = p.x;
			int y = p.y;
			int d = p.distance;
			
			if(x == maps.length-1 && y == maps[0].length-1) {
				return d;
			}
			
			for(int i=0; i<4; i++) {
				int nx = x + dx[i]; 
				int ny = y + dy[i];
				if(nx>-1 && ny>-1 && nx<maps.length && ny<maps[0].length) {
					if(!visited[nx][ny] && maps[nx][ny] == 1) {
						qu.add(new Player(nx, ny, d+1));
						visited[nx][ny] = true; // ť�� ������ �� �湮ó��
					}
				}
			}
		}
		return -1;
	}
	
	static int solution(int[][] maps) {
        int answer = 0;
        
        // �ʱ�ȭ
        visited = new boolean[maps.length][maps[0].length];
    	Player player = new Player(0, 0, 1);
    	visited[0][0] = true;
        
        // bfs
        answer = bfs(player, maps);
        
        return answer;
    }
	
	public static void main(String[] args) {
		int[][] maps1 = {{1,0,1,1,1},{1,0,1,0,1},{1,0,1,1,1},{1,1,1,0,1},{0,0,0,0,1}};
		int[][] maps2 = {{1,0,1,1,1},{1,0,1,0,1},{1,0,1,1,1},{1,1,1,0,0},{0,0,0,0,1}};
		
		System.out.println(solution(maps1));
		System.out.println(solution(maps2));
	}

}

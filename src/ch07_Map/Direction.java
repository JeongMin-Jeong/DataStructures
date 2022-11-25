package ch07_map;

import java.util.*;

public class Direction {
/* �Ӿ��̴� RPG������ �ϰ� �ֽ��ϴ�. ���ӿ��� up, down, left, right ����Ű�� ������ �� Ű�� ������ ��, �Ʒ�, ����, ���������� �� ĭ�� �̵��մϴ�. ���� ��� [0,0]���� up�� �����ٸ� ĳ������ ��ǥ�� [0, 1], down�� �����ٸ� [0, -1], left�� �����ٸ� [-1, 0], right�� �����ٸ� [1, 0]�Դϴ�. �Ӿ��̰� �Է��� ����Ű�� �迭 keyinput�� ���� ũ�� board�� �Ű������� �־����ϴ�. ĳ���ʹ� �׻� [0,0]���� ������ �� Ű �Է��� ��� ���� �ڿ� ĳ������ ��ǥ [x, y]�� return�ϵ��� solution �Լ��� �ϼ����ּ���.
 * [0, 0]�� board�� �� �߾ӿ� ��ġ�մϴ�. ���� ��� board�� ���� ũ�Ⱑ 9��� ĳ���ʹ� �������� �ִ� [-4, 0]���� ���������� �ִ� [4, 0]���� �̵��� �� �ֽ��ϴ�.
 */
	public static int[] solution(String[] keyinput, int[] board) {
        int[] answer = {};
        
        Map<String, int[]> hm = new HashMap<String, int[]>();
        hm.put("up", new int[] {0,1});
        hm.put("down", new int[] {0,-1});
        hm.put("left", new int[] {-1,0});
        hm.put("right", new int[] {1,0});
        
        // �ʱ���ġ
        int[] now = {0, 0};
        
        for(int i=0; i<keyinput.length; i++) {
        	int[] dir = hm.get(keyinput[i]);
        	int[] next = {now[0]+dir[0], now[1]+dir[1]};
        	if(next[0]>=-(board[0]/2) && next[0]<=(board[0]/2) && next[1]>=-(board[1]/2) && next[1]<=(board[1]/2)) {
        		now[0] = next[0];
        		now[1] = next[1];
        	}
        	else {
        		continue;
        	}
        }
        answer = new int[2];
        answer[0] = now[0];
        answer[1] = now[1];
        
        return answer;
    }
	
	public static void main(String[] args) {
		String[] keyinput1 = {"left", "right", "up", "right", "right"};
		int[] board1 = {11,11};
		String[] keyinput2 = {"down", "down", "down", "down", "down"};
		int[] board2 = {7,9};
		String[] keyinput3 = {"down", "down", "up", "up", "up"};
		int[] board3 = {3,3};
		
		
		System.out.println(Arrays.toString(solution(keyinput1, board1)));
		System.out.println(Arrays.toString(solution(keyinput2, board2)));
		System.out.println(Arrays.toString(solution(keyinput3, board3)));
	}

}

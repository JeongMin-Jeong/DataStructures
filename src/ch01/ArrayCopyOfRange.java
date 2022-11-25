package ch01;

import java.util.*;

public class ArrayCopyOfRange {

	public static int[] solution(int[] array, int[][] commands) {
        int[] answer = {};
        
        answer = new int[commands.length];
        ArrayList<int[]> cut = new ArrayList<>();
        
        for(int i=0; i<commands.length; i++) {
        	int[] command = commands[i];
        	cut.add(Arrays.copyOfRange(array, command[0]-1, command[1])); // array배열의 idx1부터 idx2앞까지 자름
        	Arrays.sort(cut.get(i));
        	answer[i] = cut.get(i)[command[2]-1];
        }
        
        return answer;
    }
	
	public static void main(String[] args) {
		int[] array = {1, 5, 2, 6, 3, 7, 4};
		int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
		System.out.println(Arrays.toString(solution(array, commands)));
	}

}

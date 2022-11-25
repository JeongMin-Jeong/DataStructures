package ch07_map;

import java.util.*;

public class FindParticipant {
	
	public static String solution(String[] participant, String[] completion) {
        String answer = "";
        
        HashMap<String, Integer> hm = new HashMap<>();
        for(String player : participant) {
        	hm.put(player, hm.getOrDefault(player, 0)+1);
        }
        for(String player : completion) {
        	hm.put(player, hm.get(player)-1);
        }
        for(String key : hm.keySet()) {
        	if(hm.get(key) == 1) {
        		answer = key;
        	}
        }
        
        return answer;
    }
	
	public static void main(String[] args) {
		String[] participant1 = {"leo", "kiki", "eden"};
		String[] completion1 = {"eden", "kiki"};
		
		String[] participant2 = {"marina", "josipa", "nikola", "vinko", "filipa"};
		String[] completion2 = {"josipa", "filipa", "marina", "nikola"};
		
		String[] participant3 = {"mislav", "stanko", "mislav", "ana"};
		String[] completion3 = {"stanko", "ana", "mislav"};
		
		System.out.println(solution(participant1, completion1));
		System.out.println(solution(participant2, completion2));
		System.out.println(solution(participant3, completion3));
	}

}

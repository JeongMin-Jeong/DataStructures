package ch01;


public class ReplaceAll_IndexOf {
	public static int solution(String skill, String[] skill_trees) {
        int answer = 0;
        
        for(String tree : skill_trees) {
        	String cut = tree.replaceAll("[^"+ skill +"]", "");
        	if(skill.indexOf(cut) == 0) {
        		answer++;
        	}
        }

        return answer;
    }
	
	public static void main(String[] args) {
		String skill = "CBD";
		String[] skill_trees = {"BACDE", "CBADF", "AECB", "BDA"};
		System.out.println(solution(skill, skill_trees));
	}

}

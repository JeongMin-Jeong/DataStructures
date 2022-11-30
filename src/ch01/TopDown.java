package ch01;

public class TopDown {
	public static int solution(int n) {
        int ans = 0;

        while(n != 0){
            if(n % 2 == 0){
                n /= 2;
            } else {
                n--;
                ans++;
            }
        }

        return ans;
    }
	
	public static void main(String[] args) {
		int n1 = 5;
		int n2 = 6;
		int n3 = 5000;
		System.out.println(solution(n1));
		System.out.println(solution(n2));
		System.out.println(solution(n3));
	}

}

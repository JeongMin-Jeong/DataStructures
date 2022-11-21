package ch02_Recursion;

public class HanoiTowerSolu {
/* 하노이 타워 문제의 해결
 * [재귀적 과정]
 * 1. 작은 원반 n-1개를 (맨 아래의 원반을 제외한 나머지 원반을) A에서 B로 이동
 * 2. 큰 원반(맨 아래의 원반) 1개를 A에서 C로 이동
 * 3. 작은 원반(위의 1단계에서 옮겨진 원반) n-1개를 B에서 C로 이동
 */
	public static void HanoiTowerMove(int num, char from, char by, char to) {
		if(num == 1) { // 이동할 원반의 수가 1개라면
			System.out.printf("원반 1을 %c에서 %c로 이동 \n", from, to);
		}
		else {
			HanoiTowerMove(num-1, from, to, by); // 3단계 중 1단계
			System.out.printf("원반 %d을(를) %c에서 %c로 이동 \n", num, from, to); // 3단계 중 2단계
			HanoiTowerMove(num-1, by, from, to); // 3단계 중 3단계
		}
	}
	
	public static void main(String[] args) {
		// 막대A의 원반 3개를 막대B를 경유하여 막대C로 옮기기
		HanoiTowerMove(3, 'A', 'B', 'C');
	}

}

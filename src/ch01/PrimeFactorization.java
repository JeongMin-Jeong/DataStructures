package ch01;

import java.util.*;

public class PrimeFactorization {
/* 소인수 분해 : 합성수를 소수들의 곱으로만 나타내는 것
 * 예제) 12를 소인수분해하시오.
 * 12의 인수 = {1, 2, 3, 4, 6, 12} → 12의 소인수 = {2, 3} → 12 = 2×2×3
 * ∴ 2×2×3
 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 2; i <= n; i++) {
	        while (n % i == 0) {
	            System.out.println(i);
	            n = n/i;
	        }
        }

	}
}

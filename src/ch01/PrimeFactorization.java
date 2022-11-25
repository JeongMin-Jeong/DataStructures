package ch01;

import java.util.*;

public class PrimeFactorization {
/* ���μ� ���� : �ռ����� �Ҽ����� �����θ� ��Ÿ���� ��
 * ����) 12�� ���μ������Ͻÿ�.
 * 12�� �μ� = {1, 2, 3, 4, 6, 12} �� 12�� ���μ� = {2, 3} �� 12 = 2��2��3
 * �� 2��2��3
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

package ch02_recursion;

public class FibonacciFunc {
/* 피보나치수열 구현
 * 0,1,1,2,3,5,8,13,21,34,55, ...
 * fib(n) = ┌ 0 ... n=1
 * 			│ 1 ... n=2
 *			└ fib(n-1) + fib(n-2) ... otherwise
 */
	public static int Fibo(int n) {
		if(n == 1) {
			return 0;
		}
		else if(n == 2) {
			return 1;
		}
		else {
			return Fibo(n-1) + Fibo(n-2);
		}
	}
	
	public static void main(String[] args) {
		int i;
		
		for(i = 1; i<15; i++) {
			System.out.print(Fibo(i) + " ");
		}
	}
}

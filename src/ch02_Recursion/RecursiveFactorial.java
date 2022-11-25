package ch02_recursion;

public class RecursiveFactorial {
/* 팩토리얼 구현
 * n! = n * (n-1) * (n-2) * ... * 2 * 1 
 *    = n * (n-1)!
 * f(n) = ┌ n * f(n-1) ... n≥1   
 *	  	  └ 1 		   ... n=0
 */
	public static int Factorial(int n) {
		if(n == 0) {
			return 1;
		}
		else {
			return n * Factorial(n - 1);
		}
	}
	
	public static void main(String[] args) {
		System.out.println("1! = " + Factorial(1));
		System.out.println("2! = " + Factorial(2));
		System.out.println("3! = " + Factorial(3));
		System.out.println("4! = " + Factorial(4));
		System.out.println("9! = " + Factorial(9));
	}
}

package ch02_recursion;

public class GCD {
// 최대공약수 GCD , 최소공배수 LCM
	public static void main(String[] args) {
        int num1 = 60;
        int num2 = 48;

        int gcd = GCD(num1, num2);
        System.out.println("최대공약수 : " + gcd);
        System.out.println("최소공배수 : " + (num1 * num2) / gcd);
        
    }

    public static int GCD(int num1, int num2) {
        if (num1 % num2 == 0) {
            return num2;
        }
        return GCD(num2, num1%num2);
    }

}

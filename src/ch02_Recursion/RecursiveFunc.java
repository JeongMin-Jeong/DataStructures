package ch02_recursion;

public class RecursiveFunc {

	public static void main(String[] args) {
		Recursive(3);
	}
	
	public static void Recursive(int num) {
		if(num <= 0) {
			return;
		}
		
		System.out.println("Recursive call! " + num);
		Recursive(num - 1);
	}

}

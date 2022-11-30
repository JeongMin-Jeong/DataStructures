package ch01;

import java.util.Arrays;

public class StringMethod {

	public static void main(String[] args) {
		String s1 = "abcDEF";
		String s = "012 456";
		System.out.println(s1);
		System.out.println(s);
		System.out.println("============");
		System.out.println("toUpperCase : " + s1.toUpperCase());
		System.out.println("toLowerCase : " + s1.toLowerCase());
		System.out.println("s1.indexOf(\"DE\") : " + s1.indexOf("DE"));
		System.out.println("s.substring(2) : " + s.substring(2));
		System.out.println("s.substring(2,5) : " + s.substring(2,5));
		System.out.println("Arrays.toString(s.split(\" \") : " + Arrays.toString(s.split(" ")));
	}

}

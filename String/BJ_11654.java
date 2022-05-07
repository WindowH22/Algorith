package string;

import java.util.Scanner;

//아스키 코드
public class BJ_11654 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String c = scanner.next();
		
		int n = (int)c.charAt(0);
		
		System.out.println(n);
	}
}

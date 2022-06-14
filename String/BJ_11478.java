package string;

import java.util.HashSet;
import java.util.Scanner;

public class BJ_11478{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		sc.close();
		
		HashSet<String> list = new HashSet<String>();
		
		for(int i = 0; i<= s.length(); i++){
			for (int j = i+1; j <= s.length(); j++) {
				if(!list.contains(s.substring(i, j))) {
					list.add(s.substring(i, j));
				}
			}
		}
		System.out.println(list.size());
	}
}
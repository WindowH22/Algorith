package function;

import java.lang.reflect.Method;


public class BJ_4673 {
	int[] SelfNumber = new int[10001];
	int count = 1;
	int Self = 0;
	int i = 0; 
	
	public void selfNumber(int n) {
		
		while(count <10000) {
			Self = count;
			i = count;
			while(i != 0) {
				Self += i % 10;
				i /= 10;
			}
			if(Self < 10000)
			count++;
		}
	}

}

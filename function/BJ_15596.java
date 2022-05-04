package function;

public class BJ_15596 {
	class Test {
		long sum(int[] a) {

			long total = 0;

			for (int i = 0; i < a.length; i++) {
				total += a[i];
			}
			return total;
		}
	}

}

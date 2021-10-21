package Join;

import java.util.Arrays;

public class Main {
	public static void main(String args[]) {

		int[] ar1 = Creator.array_ran(5, 1);
		int[] ar2 = Creator.array_ran(5, 1);
		// int[] ar1 = { 3, 3, 4, 4, 4 };
		// int[] ar2 = { 0, 0, 0, 1, 3 };
		// pri.pw(ar1);
		// pri.pw(ar2);
		Insert_sorter.sort(ar1);
		Insert_sorter.sort(ar2);

		int[] ar3 = Arrays.copyOf(ar2, 10);
		for (int i = 5; i < 10; i++) {
			ar3[i] = ar1[i - 5];
		}
		pri.pw(ar3);
		Joiner.join2(ar3, 0, 5, ar3.length);
		pri.pw(ar3);

		System.out.print("ok");
		// pri.pw(ar1);
		// pri.pw(ar2);

	}

}

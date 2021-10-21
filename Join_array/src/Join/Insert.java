package Join;

public class Insert {

	public static void ins(int[] ar, int low, int pos, int in) {
		int i = low;

		while (i < pos) {
			ar[i] = ar[i + 1];
			i++;
		}

		ar[pos] = in;
	}

}

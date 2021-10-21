package Join;

public class Binary_search {
	public static void search(int[] ar, int l, int ch) {
		int pos = 1;
		int high = ar.length - 1;
		int low = l + 1;
		boolean w = true;
		// boolean z = true;
		while (w) {// ---------------
			pos = (high - low) / 2 + low;
			if (ch > ar[pos]) {
				low = pos;
				if ((low + 1) == high) {
					if (ch > ar[pos] && (ch > ar[pos + 1])) {
						pos++;
					}

					w = false;
				}
			}
			if (ch < ar[pos]) {
				high = pos;
			}
			w = low == high ? false : w;
			w = ch == ar[pos] ? false : w;

		}
		while ((pos < high) && (ch == ar[pos])) {
			pos++;

		}
		if (ch <= ar[pos])
			pos--;

		Insert.ins(ar, l, pos, ch);
		// System.out.print(pos);
	}

}

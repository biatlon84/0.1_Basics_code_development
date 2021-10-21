package Join;

public class Insert_sorter {
	public static void sort(int[] ar) {
		int i = 1;
		int high = ar.length - 1;
		int low = high;
		while (i <= high) {
			low = high - i;
			int ch = ar[low];
			// Insert.take(ar, low);
			Binary_search.search(ar, low, ch);
			i++;
		}

	}
}

public class BinarySearch {
	/** Use binary search to find the key in the list */
	public static int binarySearch(int[] list, int key) {
		int low = 0;
		int high = list.length - 1;
		
		while (high >= low) {
			int mid = (low + high) / 2;
			if (key < list[mid])
				high = mid - 1; // search left
			else if (key == list[mid])
				return mid;
			else
				low = mid + 1; // search right
		}
		// return insertion point
		return -1 - low;
	}

	public static void main(String[] args) {

	}
}

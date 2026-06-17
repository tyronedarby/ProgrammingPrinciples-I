//package ch07;

public class LinearSearch {
	public static int linearSearch(int[] arr, int key) {
		int result = -1;
		
		// search array sequentially for key
		for (int i = 0; i < arr.length; i++) {
			// found key, record position
			if (arr[i] == key) {
				result = i;
			}
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		// generate an array of random numbers to search
		int[] data = new int[100];
		for (int i = 0; i < data.length; i++) {
			data[i] = (int)(Math.random() * 101);
		}
		
		// set key and perform search
		int key =  (int)(Math.random() * 101);
		int res = linearSearch(data, key);
		
		// Determine if we found it
		System.out.printf("The key %d was ", key);
		if (res != -1) {
			System.out.printf("found at index %d%n", res);
		} else {
			System.out.printf("was not found%n");
		}
		
		int[] list = {1, 4, 4, 2, 5, -3, 6, 2};
		int i = linearSearch(list, 4);  // returns 1
		int j = linearSearch(list, -4); // returns -1
		int k = linearSearch(list, -3); // returns 5

			
	}
}

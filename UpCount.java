public class UpCount {

	public static void main(String[] args) {
        // Test case
        int[] array = {2, 3, -2, 6, 8, -3, -1, 2};
        int n = 4;
        System.out.println("nUpCount for n=" + n + ": " + nUpCount(array, n)); // Output: 3
    }

	public static int nUpCount(int[] a, int n) {

		int sum = 0;
		int count = 0;

		for (int value : a) {
			sum += value;

			if(sum > n && sum - value <= n) {
				count++;
			}
		}

		return count;
	}
}
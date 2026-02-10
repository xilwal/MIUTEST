public class Main {

	public static void main(String[] args) {
        // Test case
        int[] testArray = {5, 4, 3, 2, 3, 4, 6, 1};
        int result = answerThree(testArray);
        System.out.println("Result: " + result); // Output: 1
    }

	public static int answerThree(int[] a) {

		int firstHalfSum = 0;
		int secondHalfSum = 0;
        
		if(a.length % 2 != 0 || a.length == 0) {
			return 0;
		}

		for (int i = 0; i <a.length/2 ; i++ ) {
				firstHalfSum += a[i];
				secondHalfSum += a[i + a.length/2];
		}
        
        return (firstHalfSum == secondHalfSum) ? 1 : 0;
	}
}



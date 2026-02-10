public class Main {

	public static void main(String[] args) {
        int inputNumber = 6; // Replace this with the desired number

        int nextPerfectSquare = isPerfectSquare(inputNumber);

        System.out.println("Next perfect square after " + inputNumber + " is: " + nextPerfectSquare);
    }

	public static int isPerfectSquare(int n){
		int ans = 0;
		for (int i = 1; i < n ; i++) {
			 ans = i*i;
			if( ans > n ) {
				break;
			}
		}
        return ans;
	}
}
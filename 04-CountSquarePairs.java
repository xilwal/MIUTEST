/*	Define a square pair to be the tuple <x, y> where x and y are positive, non-zero integers, x<y
	and x + y is a perfect square. A perfect square is an integer whose square root is also an integer,
	e.g. 4, 9, 16 are perfect squares but 3, 10 and 17 are not. Write a function named
	countSquarePairs that takes an array and returns the number of square pairs that can be
	constructed from the elements in the array. For example, if the array is {11, 5, 4, 20} the function
	would return 3 because the only square pairs that can be constructed from those numbers are <5,
	11>,
	<5, 20> and <4, 5>. You may assume that there exists a function named isPerfectSquare
	that returns 1 if its argument is a perfect square and 0 otherwise. E.G., isPerfectSquare(4)
	returns 1 and isPerfectSquare(8) returns 0.
	If you are programming in Java or C#, the function signature is
	int countSquarePairs(int[ ] a)
*/

public class Main{
	
	public static void main(String[] args) {
        int[] test1 = {9, 0, 2, -5, 7};
        int result1 = countSquarePairs(test1);
        System.out.println("Result for test1: " + result1); // Output: 2

        int[] test2 = {11,5,4,20};
        int result2 = countSquarePairs(test2);
        System.out.println("Result for test2: " + result2); // Output: 3
    }

	public static int countSquarePairs(int[] a) {
		if(a.length < 2)
        	return 0;
        int count = 0;
		for(int i = 0; i < a.length; i++){
			for(int j = 0; j < a.length; j++){
				if(a[i] > 0 && a[j] > 0){
					if(a[i] < a[j]){
						if(isPerfectSquare(a[i] + a[j]) == 1){
							count ++;
						}
					}
				}
			}
		}
		return count;
	}
	
	public static int isPerfectSquare(int n) {
		if(n < 1){
			return 0;
		}
		for (int i = 1; i <= n; i++ ) {
			if(i * i == n) {
				return 1;
			}
		}
		return 0;
	}
}
/*	Write a method named isDivisible that takes an integer array and a divisor and returns 1 if all
	its elements are divided by the divisor with no remainder. Otherwise it returns 0.
	If you are programming in Java or C#, the function signature is
	int isDivisible(int [ ] a, int divisor)
*/

public class Main{
	
	public static void main(String[] args) {
        int[] array1 = {3, 3, 6, 36} ;
        int n1 = 3;
        System.out.println(isDivisible(array1, n1)); // Output: 1

        int[] array2 = {3, 4, 3, 6, 36};
        int n2 = 3;
        System.out.println(isDivisible(array2, n2)); // Output: 0

        int[] array3 = {4};
        int n3 = 2;
        System.out.println(isDivisible(array3, n3)); // Output: 1
    }

	public static int isDivisible(int [] a, int divisor) {
		
		if(a.length == 0) {
			return 1;
		}

		for(int i = 0; i < a.length; i++) {
			if(a[i] % divisor != 0) {
				return 0;
			}
		}
		return 1;
	}
}
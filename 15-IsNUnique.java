/*  An array is defined to be n-unique if exactly one pair of its elements sum to n. For example,
    the array {2, 7, 3, 4} is 5-unique because only a[0] and a[2] sum to 5. But the array {2, 3, 3, 7}
    is not 5-unique because a[0] + a[1] = 5 and a[0] + a[2] = 5.
    Write a function named isNUnique that returns 1 if its integer array argument is n-unique,
    otherwise it returns 0. So isNUnique(new int[ ]{2, 7, 3, 4}, 5) should return 1 and
    isNUnique(new int[] {2, 3, 3, 7}, 5) should return 0.
    If you are programming in Java or C#, the function signature isint isNUnique(int[ ] a, int n)
*/

public class Main{
	
    public static void main(String[] args) {
        int[] array1 = {7, 3, 3, 2, 4};
        int n1 = 6;
        System.out.println(isNUnique(array1, n1)); // Output: 0

        int[] array2 = {2, 7, 3, 4};
        int n2 = 5;
        System.out.println(isNUnique(array2, n2)); // Output: 1

        int[] array3 = {7, 3, 3, 2, 4};
        int n3 = 11;
        System.out.println(isNUnique(array3, n3)); // Output: 1

        int[] array4 = {7, 3, 3, 2, 4};
        int n4 = 8;
        System.out.println(isNUnique(array4, n4)); // Output: 0

        int[] array5 = {7, 3, 3, 2, 4};
        int n5 = 4;
        System.out.println(isNUnique(array5, n5)); // Output: 0

        int[] array6 = {1};
        int n6 = 42;
        System.out.println(isNUnique(array6, n6)); // Output: 0
    }

	public static int isNUnique(int[] a, int n){
		
        if(a.length < 2) {
			return 0;
		}

		int count = 0;

		for(int i = 0; i < a.length; i++) {
			for(int j = i+1; j < a.length; j++) {
				if(a[i] + a[j] == n ) {
					count++;
				}
			}
		}

		return count == 1 ? 1: 0;

	}
}
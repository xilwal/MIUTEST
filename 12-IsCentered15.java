/*  An array is called centered-15 if some consecutive sequence of elements of the array sum to
    15 and this sequence is preceded and followed by the same number of elements. For example
    {3, 2, 10, 4, 1, 6, 9} is centered-15 because the sequence 10, 4, 1 sums to 15 and the sequence is
    preceded by two elements (3, 2) and followed by two elements(6,9).Write a method called isCentered15 that returns 1 if its array argument is centered-15, otherwise
    it returns 0.
    If you are programming in Java or C#, the function prototype is
    int isCentered15(int[ ] a)
*/

public class Main {

    public static void main(String[] args) {
        int[] array1 = {3, 2, 10, 4, 1, 6, 9};
        int[] array2 = {3, 2, 10, 4, 1, 6};
        int[] array3 = {3, 15, 1};
        int[] array4 = {1, 2, 3, 4};
        int[] array5 = {};
        int[] array6 = {1, 1, 15 -1,-1};

        System.out.println("Array 1: " + isCentered15(array1)); // Output: 1
        System.out.println("Array 2: " + isCentered15(array2)); // Output: 0
        System.out.println("Array 3: " + isCentered15(array3)); // Output: 1
        System.out.println("Array 4: " + isCentered15(array4)); // Output: 0
        System.out.println("Array 5: " + isCentered15(array5)); // Output: 0
        System.out.println("Array 6: " + isCentered15(array6)); // Output: 1
    }

    public static int isCentered15(int[] a) {
        
        if (a.length < 1) {
            return 0;
        }

        for (int i = 0; i < a.length; i++) {
            int sum = 0;
            for(int j=i+1; j < a.length-1-i; j++){
                sum += a[j];
            }
            if(sum == 15)
                return 1;
        }

        return 0;
    }
}

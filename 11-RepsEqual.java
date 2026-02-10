/*  An array can hold the digits of a number. For example the digits of the number 32053 are
    stored in the array {3, 2, 0, 5, 3}. Write a method call repsEqual that takes an array and an
    integer and returns 1 if the array contains only the digits of the number in the same order that
    they appear in the number. Otherwise it returns 0.
    If you are programming in Java or C#, the function prototype is
    int repsEqual(int[ ] a, int n)
*/

public class Main {
    
    public static void main(String[] args) {
        int[] a1 = {3, 2, 0, 5, 3};
        int n1 = 32053;
        System.out.println(repsEqual(a1, n1));  // Output: 1

        int[] a2 = {3, 2, 0, 5};
        int n2 = 32053;
        System.out.println(repsEqual(a2, n2));  // Output: 0

        int[] a3 = {3, 2, 0, 5, 3, 4};
        int n3 = 32053;
        System.out.println(repsEqual(a3, n3));  // Output: 0

        int[] a4 = {2, 3, 0, 5, 3};
        int n4 = 32053;
        System.out.println(repsEqual(a4, n4));  // Output: 0

        int[] a5 = {9, 3, 1, 1, 2};
        int n5 = 32053;
        System.out.println(repsEqual(a5, n5));  // Output: 0

        int[] a6 = {0, 3, 2, 0, 5, 3};
        int n6 = 32053;
        System.out.println(repsEqual(a6, n6));  // Output: 1
    }

    static int repsEqual(int[] a, int n) {
        
        int num = n;
        int index = a.length - 1;

        while (num > 0 && index >= 0) {
            int digit = num % 10;
            if (a[index] != digit) {
                return 0;
            }

            num /= 10;
            index--;
        }
        return (num == 0) ? 1 : 0; // Return 1 if all digits matched, 0 otherwise
    }
}
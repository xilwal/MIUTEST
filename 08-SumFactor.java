/*The sum factor of an array is defined to be the number of times that the sum of the array
appears as an element of the array. So the sum factor of {1, -1, 1, -1, 1, -1, 1} is 4 because the
sum of the elements of the array is 1 and 1 appears four times in the array. And the sum factor of
{1, 2, 3, 4} is 0 because the sum of the elements of the array is 10 and 10 does not occur as an
element of the array. The sum factor of the empty array { } is defined to be 0.
Write a function named sumFactor that returns the sum factor of its array argument.
If you are programming in Java or C#, the function signature is
int sumFactor(int[ ] a)
*/
public class Main {
    public static void main(String[] args) {
        int[] arr1 = {3,0,2,-5,0}; //output 2
        int[] arr2 = {9,-3,-3,-1,-1}; //output 0
        int[] arr3 = {0,0,0}; //output 3

        System.out.println(sumFactor(arr1)); //output 1
        System.out.println(sumFactor(arr2)); //output 0
        System.out.println(sumFactor(arr3)); //output 1
    }

    public static int sumFactor (int[] a) {
        
        int sum = 0;
        int count = 0;

        if(a.length == 0) {
            return 0;
        }

        for (int i = 0; i< a.length ; i++ ) {
            sum += a[i];   
        }

        for (int j = 0; j<a.length ; j++ ) {
            if(a[j] == sum) {
                count++;
            }
        }
        return count;
    }
}
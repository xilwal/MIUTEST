/*  The Stanton measure of an array is computed as follows. Count the number of 1s in the
    array. Let this count be n. The Stanton measure is the number of times that n appears in the array.
    For example, the Stanton measure of {1, 4, 3, 2, 1, 2, 3, 2} is 3 because 1 occurs 2 times in the
    array and 2 occurs 3 times.Write a function named stantonMeasure that returns the Stanton measure of its array argument.
    If you are programming in Java or C#, the function prototype is
    int stantonMeasure(int[ ] a)
*/
    
public class Main {

    public static void main(String[] args) {
        int[] arr1 = {1,3,1,1,3,3,2,3,3,3,4}; 
        int[] arr2 = {1}; 
        int[] arr3 = {0}; 

        System.out.println(stantonMeasure(arr1)); //output 6
        System.out.println(stantonMeasure(arr2)); //output 1
        System.out.println(stantonMeasure(arr3)); //output 1
    }

    public static int stantonMeasure (int[] a) {
        
        int oneCount = 0;
        int statonCount = 0;

        for (int i = 0; i < a.length ; i++ ) {
            if(a[i] == 1){
                oneCount++;   
            }
        }

        for (int j = 0; j < a.length ; j++ ) {
            if(a[j] == oneCount) {
                statonCount++;
            }
        }
        return statonCount;
    }
}


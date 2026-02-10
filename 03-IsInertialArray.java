/*  An array is defined to be inertial if the following conditions hold:
    a. it contains at least one odd value
    b. the maximum value in the array is even
    c. every odd value is greater than every even value that is not the maximum value.
    Write a function called isIntertial that accepts an integer array and returns 1 if the array is
    inertial; otherwise it returns 0.
    If you are programming in Java or C#, the function signature is
    int isInertial(int[ ] a
*/
    
public class Main {

    public static void main(String[] args){
        int result = isInertial(new int[]{1});
        System.out.println(result);
        result = isInertial(new int[]{2});
        System.out.println(result);
        result = isInertial(new int[]{1, 2, 3, 4});
        System.out.println(result);
        result = isInertial(new int[]{1, 1, 1, 1, 1, 1, 2});
        System.out.println(result);
        result = isInertial(new int[]{2, 12, 4, 6, 8, 11});
        System.out.println(result);
        result = isInertial(new int[]{2, 12, 12, 4, 6, 8, 11});
        System.out.println(result);
        result = isInertial(new int[]{-2, -4, -6, -8, -11});
        System.out.println(result);
        result = isInertial(new int[]{2, 3, 5, 7});
        System.out.println(result);
        result = isInertial(new int[]{2, 4, 6, 8, 10});
        System.out.println(result);
    }

    public static int isInertial(int[] a) {
        
        int hasOdd = 0;
        int max = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 1) {
                hasOdd = 1;
            }
            if (a[i] > max) {
                max = a[i];
            }
        }

        if (hasOdd == 0 || max % 2 == 1) {
            return 0;
        }

        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 1 && a[i] != max) {
                for (int j = 0; j < a.length; j++) {
                    if (a[j] % 2 == 0 && a[j] != max && a[j] > a[i]) {
                        return 0;
                    }
                }
            }
        }
        return 1;
    }
}
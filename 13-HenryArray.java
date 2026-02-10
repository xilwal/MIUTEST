/*  A perfect number is one that is the sum of its factors, excluding itself. The 1st perfect
    number is 6 because 6 = 1 + 2 + 3. The 2nd perfect number is 28 which equals 1 + 2 + 4 + 7 +
    14. The third is 496 = 1 + 2 + 4 + 8 + 16 + 31 + 62 + 124 + 248. In each case, the number is the
    sum of all its factors excluding itself.Write a method named henry that takes two integer arguments, i and j and returns the sum of the
    ith and jth perfect numbers. So for example, henry (1, 3) should return 502 because 6 is the 1st
    perfect number and 496 is the 3rd perfect number and 6 + 496 = 502.
    The function signature is
    int henry (int i, int j)
*/

public class Main {
   
    public static void main(String[] args) {
        System.out.println(henry(1, 3));  // Output: 502
        System.out.println(henry(2, 3));  // Output: 524
        System.out.println(henry(3, 2));  // Output: 34
    }

    public static int henry(int i, int j) {
       
        int count = 0;
        int num = 1;
        int result = 0;

        while (count < j || count < i) {
            
            int sum = 0;
            for (int k = 1; k <= num / 2; k++) {
                if (num % k == 0) {
                    sum += k;
                }
            }
            
            if(sum == num){
                count++;
                if (count == i || count == j) {
                    result += num;
                }
            }
            num++;
        }
        return result;
    }
}

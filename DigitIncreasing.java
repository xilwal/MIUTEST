public class Main {

    public static void main(String[] args) {
        // Examples
        System.out.println(isDigitIncreasing(367));   // Output: 0
        System.out.println(isDigitIncreasing(36));   // Output: 1
        System.out.println(isDigitIncreasing(984));  // Output: 1
        System.out.println(isDigitIncreasing(7404)); // Output: 1
        System.out.println(isDigitIncreasing(24));   // Output: 1
        System.out.println(isDigitIncreasing(321));  // Output: 0
        System.out.println(isDigitIncreasing(0));    // Output: 0
    }

    public static int isDigitIncreasing(int n) {
       
        int num = n;

        for (int i = 1; i <= 9; i++) {
           
           int sum = 0;
           int result = i;
           
           while(sum <= num){
           	 sum += result;
             if(sum == num){
           	 	return 1;
           	 }
           	 result = result * 10 + i;
           }
 
        }

        return 0;
    }
}

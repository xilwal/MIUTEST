public class Main {

    public static void main(String[] args) {
        // Examples
        System.out.println(isCubePowerful(153)); // Output: 1
        System.out.println(isCubePowerful(370)); // Output: 1
        System.out.println(isCubePowerful(371)); // Output: 1
        System.out.println(isCubePowerful(407)); // Output: 1
        System.out.println(isCubePowerful(87));  // Output: 0
        System.out.println(isCubePowerful(0));   // Output: 0
        System.out.println(isCubePowerful(-81)); // Output: 0
    }
    
    public static int isCubePowerful(int n) {
        
        if (n <= 0) {
            return 0;
        }
        
        int num = n;
        int totalSum = 0;

        while(num > 0){
          int digit = num%10;
          int digitSum = digit * digit * digit;
          totalSum += digitSum;
          num = num/10;
        }
        
        return totalSum == n ? 1 : 0;
    }
}

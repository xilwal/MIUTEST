public class Main {

    public static void main(String[] args) {
        // Test cases
        System.out.println(isHodder(2)); // 0
        System.out.println(isHodder(3)); // 1
        System.out.println(isHodder(7)); // 1
        System.out.println(isHodder(8)); // 0
        System.out.println(isHodder(31)); // 1
        System.out.println(isHodder(127)); // 1
    }

   
    public static int isHodder(int n) {
        
        if (n < 2) {
            return 0;
        }
        
        int num = n;
        
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return 0;
            }
        }
        
        
        int result = 1;
        int i = 1;
        while(result < num) {
        	result = 2 * result;
        }
         
        if (n == result - 1) {
            return 1;
        }
        return 0;
    }
}

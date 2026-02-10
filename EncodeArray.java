import java.util.Arrays;

public class Main {
  
    public static int[] encodeArray(int n) {
        int sign = 1;
        int arrayCount = 0;
        
        if(n==0){
        	return new int[]{1};
        }

        if (n < 0) {
            sign = -1;
            arrayCount = 1;
        }

        int num = n * sign;

        // Calculate arrayCount
        int tempNum = num;
        while (tempNum > 0) {
            arrayCount += tempNum % 10 + 1;
            tempNum /= 10;
        }

        // Create the result array
        int[] result = new int[arrayCount];
        int currentIndex = arrayCount - 1;
        if(sign == -1)
        	result[0] = -1;

        // Fill the result array
        while (num > 0) {
            int digit = num % 10;
            num /= 10;

            result[currentIndex--] = 1;

            for (int i = 1; i <= digit; i++) {
                result[currentIndex--] = 0;
            }
        }
            
        return result;
    }

    public static void main(String[] args) {
        int n = -1;
        int[] encodedArray = encodeArray(n);

        System.out.println(Arrays.toString(encodedArray));
    }

    
}
public class Main {
    public static void main(String[] args) {
        System.out.println(smallest(6)); // Output: 624
    }

    public static int smallest(int n) {
        if (n < 2)
            return 0;

        int max = Integer.MAX_VALUE;

        for (int i = 1; i < max; i++) {
            int count = 0;

            for (int j = 1; j <= n; j++) { // Change to <= to include the nth multiple
                int num = i * j;
                int foundTwo = 0;

                while (num > 0) {
                    int digit = num % 10;
                    num = num / 10;
                    if (digit == 2){
                        foundTwo = 1;
                        break;
                    }
                }

                if (foundTwo == 1)
                    count++;
                else
                    break; // Move the break statement inside the inner loop
            }

            if (count == n)
                return i;
        }
        return 0;
    }
}

public class Main{
	public static void main(String[] args) {
        int result1 = convertToBase10(new int[]{1, 0, 1, 1}, 2);
        int result2 = convertToBase10(new int[]{1, 1, 2}, 3);
        int result3 = convertToBase10(new int[]{3, 2, 5}, 8);
        int result4 = convertToBase10(new int[]{-1,3}, 2);

        System.out.println(result1); // Output: 11
        System.out.println(result2); // Output: 14
        System.out.println(result3); // Output: 213
        System.out.println(result4); // Output: 0
    }

	public static int convertToBase10(int[] a, int base){
		if(base < 1 || a.length < 1) {
			return 0;
		}
		for(int i = 0; i < a.length; i++){
			if(a[i] >= base){
				return 0;
			}
		}

		int result = 0;
        int power = 1;

        for (int i = a.length - 1; i >= 0; i--) {
            result += a[i] * power;
            power *= base;
        }
        return result;
	}
}
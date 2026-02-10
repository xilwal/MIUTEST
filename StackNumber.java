public class Main{
	public static void main(String[] args) {
        System.out.println(isStacked(10)); // Output: 1
        System.out.println(isStacked(15)); // Output: 1
        System.out.println(isStacked(6)); // Output: 1
        System.out.println(isStacked(5)); // Output: 0
        System.out.println(isStacked(3)); // Output: 1
        System.out.println(isStacked(1)); // Output: 1
        System.out.println(isStacked(0)); // Output: 0
	}

	public static int isStacked(int n){
		if(n <= 0)
			return 0;
		if(n == 1)
			return 1;
		int sum = 0;
		for(int i = 1; i < n; i++) {
			sum += i;
			if(sum == n) {
				return 1;
			}
		}
		return 0;
	}
}
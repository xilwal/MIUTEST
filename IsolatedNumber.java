public class Main{
	
	public static void main(String[] args) {
		System.out.println(isIsolated(0)); // Output: -1
        System.out.println(isIsolated(1)); // Output: 0
        System.out.println(isIsolated(2)); // Output: 1
        System.out.println(isIsolated(9)); // Output: 1
        System.out.println(isIsolated(10)); // Output: 0
        System.out.println(isIsolated(28)); // Output: 1
        System.out.println(isIsolated(58)); // Output: 1
        System.out.println(isIsolated(60)); // Output: 0
        System.out.println(isIsolated(2097152)); // Output: -1	
	}

	public static int isIsolated(long n) {
		
		if(n < 1 || n > 2097151)
			return -1;

		long squareValue = n * n;
		long cubeValue = n * n * n;
		long num = n;
		long squareDigit = 0;
		long cubeDigit = 0;

		while(squareValue > 0) {
			squareDigit = squareValue % 10;
			squareValue = squareValue/10;

			while(cubeValue > 0) {
				cubeDigit = cubeValue % 10;
				if(squareDigit == cubeDigit)
					return 0;
				cubeValue = cubeValue/10;
			}
			
		}
		
		return 1;
	}
}
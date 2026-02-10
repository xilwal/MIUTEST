/*It is a fact that there exist two numbers x and y such that x! + y! = 10!. Write a method named
	solve10 that returns the values x and y in an array.
	The notation n! is called n factorial and is equal to n * n-1 * n-2 * … 2 * 1, e.g., 5! =
	5*4*3*2*1 = 120.If you are programming in Java or C#, the function prototype is
	int[ ] solve10() where the length of the returned array is 2.
*/
	
public class Main{
	   
	public static void main(String[] args) {
        int[] result = solve10();
        System.out.println("x: " + result[0] + ", y: " + result[1]);
    }

	public static int[] solve10(){
		
		int targetFactorial = 1;
		for(int i = 1; i <= 10; i++) {
			targetFactorial *= i;
		}

		int[] result = new int[2];
		int factorialX = 1;
		int factorialY = 1;

		for(int x = 1; x <= 5; x++) {
			factorialX *= x;
			for(int y = 1; y <= 5; y++) {
				factorialY *= y;
				if(factorialX + factorialY == targetFactorial) {
					result[0] = x;
					result[1] = y;
					return result;
				}
			}
		}
		return result;
	}
}
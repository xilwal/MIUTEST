public class FancyNumber{

	public static void main(String[] args) {
        System.out.println(isFancy(1));    // Output: 1
        System.out.println(isFancy(17));   // Output: 1
        System.out.println(isFancy(5));    // Output: 1
        System.out.println(isFancy(10));   // Output: 0
        System.out.println(isFancy(61));   // Output: 1
        System.out.println(isFancy(7));    // Output: 0
        System.out.println(isFancy(3));    // Output: 0
    }

	public static int isFancy(int num) {
		int previous = 1;
		int pPrevious = 1;
		int currentNum = 0;

		if(num == 1)
			return 1;
		if(num <= 0)
			return 0;
		while(num >= currentNum) {
			currentNum = (3 * previous) + (2 * pPrevious);
			if(currentNum == num) {
				return 1;
			}
			pPrevious = previous;
			previous = currentNum;
		}
		return 0;
	}
    
}
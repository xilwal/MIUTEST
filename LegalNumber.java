public class Main{
	public static void main(String[] args) {
		int[] array = {3, 2, 1};
        int n = 4;
        System.out.println(isLegalNumber(array, n)); // Output: 1
	}

	public static int isLegalNumber(int[] a, int base){
		if(base < 0 || a.length < 1) {
			return 0;
		}
		for(int i = 0; i < a.length; i++){
			if(a[i] > base){
				return 0;
			}
		}
		return 1;
	}
}
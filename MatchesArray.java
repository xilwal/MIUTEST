public class Main{
	public static void main(String[] args) {
        int[] a = new int[]{1, 2, 3, -5, -5, 2, 3, 18};
        int[] p = new int[]{2, 1, -1, -1, 2, 1};

        System.out.println(matches(a,p)); // Output: 1
    }

	public static int matches(int[] a, int[] p) {
		
		if(a.length < 1 || p.length < 1)
			return 0;

		int pArraySum = 0;
        int test = 1111;

		for(int i = 0; i < p.length; i++) {

			int pElement = p[i];
            
			if(pElement == 0)
            	return 0;

			if(pElement < 0)
				pElement = pElement * -1;

			for(int j = pArraySum; j < pArraySum + pElement; j++) {
				if(p[i] * a[j] < 0 )
					return 0;
				
			}
			pArraySum += pElement;
		}

        if(pArraySum == a.length)
        	return 1;

        return 0;
	}
}
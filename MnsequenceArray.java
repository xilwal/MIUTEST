public class Main{
	public static void main(String[] args) {
    	int[] a = {-5,-4,-3,-2,-1,1};
        int m = -5;
        int n = 1;
		System.out.println(isSequencedArray(a,m,n));
	}

	public static int isSequencedArray(int[] a, int m, int n){
		
		if(n < m || a.length < 1 || a[0] != m || a[a.length-1] != n)
			return 0;

		int current = a[0];

		for(int i = 1; i < a.length - 1; i++){
			
			if(a[i] < current)
				return 0;
                
			if(a[i] != current && (a[i] - 1) != current)
				return 0;
            
            current = a[i];
		}
		return 1;
	}
}
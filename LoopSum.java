public class Main{
	
	public static void main(String[] args) {
		int[] a = {1,2,3};
		System.out.println(loopSum(a, 4));
	}

	public static int loopSum(int[] a, int n){
		if(n < 1 || a.length == 0)
        	return 0;
		if(n==1)
        	return a[0];
		int sum = 0;
		int k = 0;
		for(int i = 0; i < n; k++, i++){
			if(i == a.length)
            	k = 0;
			sum += a[k];
            
		}
		return sum;
	}
}
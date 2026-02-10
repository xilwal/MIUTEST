public class Main{
	
	public static void main(String[] args) {
		int[] a = {1,2,1};
		System.out.println(allValuesTheSame(a));
	}

	public static int allValuesTheSame(int[] a){
		if(a.length == 0)
        	return 0;
		if(a.length == 1)
        	return 1;
		for(int i = 1; i < a.length; i++){
			if(a[i] != a[0])
				return 0;
		}
		return 1;
	}
}
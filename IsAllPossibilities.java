public class Main{
	
	public static void main(String[] args) {
		int[] a = {0,6,1,2,3,5,4};
		System.out.println(isAllPossibilities(a));
	}

	public static int isAllPossibilities(int[] a){
		if(a.length == 0)
        	return 0;
		int num = 0;
		while(num < a.length){
			int numFound = 0;
			for(int i = 0; i < a.length; i++){
				if(a[i] == num){
					numFound = 1;
					break;
				}
			}
			if(numFound == 0)
				return 0;
			num++;
		}
		return 1;
	}
}
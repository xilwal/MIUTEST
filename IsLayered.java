public class Main{
	
	public static void main(String[] args) {
		int[] a = {1,1,2,2,2,3,3,3,4,4};
		System.out.println(isLayered(a));
	}

	public static int isLayered(int[] a){
		if(a.length == 2)
        	return 0;

		int count = 0;
		for(int i = 0; i < a.length-1; i++){
				
                if(a[i] > a[i+1])
					return 0;
                
                if(a[i] != a[i+1] && count == 1){
                	count = 0;
                }else if(a[i] == a[i+1]){
                	count = 1;
                }else{
                	return 0;
                }
			}
            
		if(count == 0)
			return 0;
		return 1;
	}
}
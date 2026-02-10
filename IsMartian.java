public class Main {

    public static void main(String[] args) {
        System.out.println(isMartian(new int[]{1, 2, 1, 2, 1, 2, 1, 2, 1}));  // Output: 1
        
    }

    public static int isMartian(int[] a) {
        
        int prev = 0;
        int oneCount = 0;
        int twoCount = 0;
        
       	for(int i = 0; i < a.length; i++){
       		
			if(a[i] == 1)
            	oneCount++;
            if(a[i] == 2)
            	twoCount++;
                
             if(a[i] == prev && i != 0)
             	return 0;
             
             prev = a[i];
       	}
        
        
        if(oneCount > twoCount)
        	return 1;
        return 0;
    }
}

public class Main {

    public static void main(String[] args) {
        System.out.println(is235Array(new int[]{2, 3, 4, 5, 6, 7, 8, 9, 10}));  // Output: 1
        
    }

    public static int is235Array(int[] a) {
        
        int twoCount = 0;
        int threeCount = 0;
        int fiveCount = 0;
        int zeroCount = 0;
        
       	for(int i = 0; i < a.length; i++){
       		

            if(a[i]%2 == 0){
            	twoCount++;
            }
            if(a[i]%3 == 0){
            	threeCount++;
                
            }
            if(a[i]%5 == 0){
            	fiveCount++;
                
            }
            if(a[i]%2!=0||a[i]%3!=0||a[i]%5!=0){
            	zeroCount++;
            }
            
       	}
        
        int result = twoCount+threeCount+fiveCount+zeroCount;
        if(a.length == result)
        	return 1;
        return 0;
    }
}

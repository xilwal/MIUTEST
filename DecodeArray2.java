public class Main {

    public static void main(String[] args) {
        // Examples
        System.out.println(decodeArray(new int[]{1})); // Output: 0
        System.out.println(decodeArray(new int[]{0, 1, 1, 1, 1, 1, 0, 1})); // Output: 100001
        System.out.println(decodeArray(new int[]{-1,0,0,1})); // Output: -2
    }

    static int decodeArray(int[] a) {
    	
        if(a.length < 2 || a[a.length-1] != 1)
			return 0;
       
        int result = 0;
        int zeroCount = 0;
        int sign = 1;
        
        for (int i = 0; i < a.length; i++) {
        	
            if(i == 0 && a[0] == -1) {
            	sign = -1;
                i = i+1;
            }
            
            if(a[i] == 0){
            	zeroCount++;
            }else if(a[i] == 1){
            	result = result * 10 + zeroCount;
                zeroCount = 0;
         	}else{
              return 0;
            }
        }

        return result * sign;
    }
}

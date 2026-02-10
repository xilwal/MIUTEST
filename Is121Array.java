public class Main {

    public static void main(String[] args) {
        // Examples
        int[] array1 = {1, 2, 1};
        int result1 = is121Array(array1);
        System.out.println("Result 1: " + result1);

        int[] array2 = {1, 1, 2, 2, 2, 1, 1};
        int result2 = is121Array(array2);
        System.out.println("Result 2: " + result2);

        int[] array3 = {1, 1, 2, 2, 2, 1, 1, 1};
        int result3 = is121Array(array3);
        System.out.println("Result 3: " + result3);

        int[] array4 = {1, 1, 1, 1, 2, 1, 1};
        int result4 = is121Array(array4);
        System.out.println("Result 4: " + result4);

        int[] array5 = {1, 1, 1, 2, 2, 2, 1, 1, 1, 3};
        int result5 = is121Array(array5);
        System.out.println("Result 5: " + result5);

        int[] array6 = {1, 1, 1, 1, 1, 1};
        int result6 = is121Array(array6);
        System.out.println("Result 6: " + result6);

        int[] array7 = {2, 2, 2, 1, 1, 1, 2, 2, 2, 3};
        int result7 = is121Array(array7);
        System.out.println("Result 7: " + result7);

        int[] array8 = {1, 3, 2, 1, 1};
        int result8 = is121Array(array8);
        System.out.println("Result 8: " + result8);
    }

    static int is121Array(int[] a) {
        
        int length = a.length;
        
		if(a[0] != 1 || a[length-1] != 1 || a[length/2] != 2)
        	return 0;
            
        for(int i = 1; i < length; i++){
        	
            if(a[i] != 1 && a[i] != 2)
            	return 0;
                
        	if(a[i] == 1 && a[length-i-1] != 1)
            	 return 0;     
            
        }
            	
        return 1;
    }
}

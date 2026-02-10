public class Main {
	
     public static void main(String[] args) {
		int[] array = {1,2,3,5,6,0,1};
        int[] result = fill(array, 3, 10);
        printArray(result);
    }
  
    public static int[] fill(int[] arr, int k, int n) {
    
      if(n < 1 || k < 1 || arr.length < 1)
          return new int[0];
          
	  int[] result = new int[n];
      int m = 0;
      
      for(int i = 0; i < n; i++){
      	if(i%k == 0) m = 0;
        result[i] = arr[m];
        m++;
      }
      
      return result;
      
    }
    static void printArray(int[] array) {
        System.out.print("{");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("}");
    }
    
}
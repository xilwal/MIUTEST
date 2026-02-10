public class Main {
	
     public static void main(String[] args) {
		int[] array = {8};
         System.out.println(sumIsPower(array));
    }
  
    static boolean sumIsPower(int[] arr) {
    
      if(arr.length < 1)
          return false;
          
	  int sum = 0;
      
      for(int i = 0; i < arr.length; i++){
      	sum = sum + arr[i];
      }
      
      if(sum%2 == 1) return false;
      
      for(int j = 2; j <= sum; j = j*2){
      	if(sum == j) return true;
      }
      
      return false;
      
    }
}
public class Main {
	
     public static void main(String[] args) {

        System.out.println(isTriangular(7));
    }
  
    public static int isTriangular(int n) {
    
      if(n < 1)
          return 0;
          
      int sum = 0;
	  for(int i = 1; i < n; i++){
      	
        if(sum == n)
      		return 1;
        
      	sum += i; 
      }
      
      return 0;
      
    }
    
}
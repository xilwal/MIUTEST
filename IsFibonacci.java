public class Main {
  
     public static void main(String[] args) {

        System.out.println(isFibonacci(8));
    }
  
    public static int isFibonacci(int n) {
    
      if(n < 1)
          return 0;
          
    if(n == 1)
        return 1;
        
      int sum = 1;
      int prev = 1;

      while(sum <= n){
        
        if(sum == n)
          return 1;
            
        sum = sum + prev;
        prev = sum;
        
      }
      
      return 0;
      
    }
    
}
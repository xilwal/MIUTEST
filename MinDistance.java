public class Main {
  public static void main(String[] args) {
    System.out.println(minDistance(13013));
  }
  
  public static int minDistance(int n){
  	
    if(n < 1)
  		return 0;
        
  	int min = Integer.MAX_VALUE, factor = 1;
    
    for(int i = 2; i < n; i++){
    	
        if(n%i == 0){
        	int sum = i - factor;
            if(sum < min){
            	min = sum;
            }
            factor = i;
        }
    }
    if(min == Interger.MAX_VALUE)
    	return -1;
  	return min;
    
  }
}

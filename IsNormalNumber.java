public class Main {
  public static void main(String[] args) {
    
    System.out.println(isNormal(10));
  }
  public static int isNormal(int n){
  	if(n == 0){
    	return 0;
    }
    
    for(int i = 2; i < n; i++){
    	if(n%i == 0){
        	if(i%2 == 1){
            	return 0;
            }
        }
    }
    
    return 1;
  }
}

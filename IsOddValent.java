public class Main {

  public static void main(String[] args) {
    int[] a = {1,4,1,4};
    System.out.println(isOddValent(a));
  }
  
  public static int isOddValent(int[] a){
  	
    if(a.length < 2){
    	return 0;
    }
    
    int oddFound = 0;
    int moreFound = 0;
    
    for(int i = 0; i < a.length; i++){
    	if(a[i]%2 == 1){
        	oddFound = 1;
        }
        for(int j=i+1; j < a.length; j++){
        	if(a[i] == a[j]){
            	moreFound = 1;
                break;
            }
        }
    }
    
    if(oddFound == 1 && moreFound == 1){
    	return 1;
    }
    
    return 0;
  }
}

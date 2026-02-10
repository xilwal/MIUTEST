public class Main {
  public static void main(String[] args) {
  	int[] a = {1, 2, 1, 3, 3, 2};
    System.out.println(isDual(a)); //output
  }
  
  public static int isDual(int[] a){
  	
    if(a.length < 2) return 0;
        
    for(int i = 0; i < a.length; i++){
    	int count = 0;
        for(int k = 0; k < a.length; k++){
        	if(a[i] == a[k]) count++;
        }
        if(count != 2) return 0;
    }
    
    return 1;
    
  }
}

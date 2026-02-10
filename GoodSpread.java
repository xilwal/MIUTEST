public class Main {
  public static void main(String[] args) {
  	int[] a = {};
    System.out.println(goodSpread(a)); //output
  }
  
  public static int goodSpread(int[] a){
 
 	for(int i = 0; i <a.length; i++){
    	int count = 0;
        for(int k = 0; k < a.length; k++){
        	if(a[i] == a[k])
            	count++;
        }
        if(count > 3)
        	return 0;
    }
    return 1;
  }
}

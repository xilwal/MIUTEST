public class Main {
  public static void main(String[] args) {
    int[] a = {1,3};
    System.out.println(isDaphne(a));
  }
  public static int isDaphne(int[] a){
  	if(a.length < 1){
    	return 0;
    }
    int num = a[0]%2;
    for(int i = 1; i < a.length; i++){
    	if(a[i]%2 != num){
        	return 0;
        }
    }
    
    return 1;
  }
}

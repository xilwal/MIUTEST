public class Main {
  public static void main(String[] args) {
  	int[] a = {0,1};
    int[] b = {-1,2};
    int[] c = {};
    int[] d = {5,5,5,5};
    int[] e = {5,5,5,2,5};
    int[] f = {2,3,3,9,9};
    int[] g = {1,2,3,3,3,3,4};
    System.out.println(isSequentiallyBounded(a)); //output 0
    System.out.println(isSequentiallyBounded(b)); //output 0
    System.out.println(isSequentiallyBounded(c)); //output 1
    System.out.println(isSequentiallyBounded(d)); //output 1
    System.out.println(isSequentiallyBounded(e)); //output 0
    System.out.println(isSequentiallyBounded(f)); //output 1
    System.out.println(isSequentiallyBounded(g)); //output 0
  }
  
  public static int isSequentiallyBounded(int[] a){
  	if(a.length < 2)
    	return 1;
    for(int i = 0; i < a.length; i++) {
    	if(a[i] <= 0)
        	return 0;
        
        int count = 0;
        for(int j = i + 1; j < a.length; j++){
        	if(a[i] > a[j])
            	return 0;
            if(a[i] == a[j])
            	count++;
       	}
        if(count > a[i])
        	return 0;
     }
     return 1;
  }
}
import java.util.*;

public class Main {
  public static void main(String[] args) {
  	int[] a = {2,5,4,-1};
    int[] result = pairWiseSum(a);
    System.out.println(Arrays.toString(result));
  }
  
  public static int[] pairWiseSum(int[] a){
  	int length = a.length;
    if(length < 2 || length%2 == 1)
    	return new int[]{};
    int[] result = new int[length/2];
    int k = 0;
    for(int i = 0; i < a.length - 1; i = i + 2){
    	int sum = a[i]+a[i+1];
        result[k] = sum;
        k++;
    }
    return result; 
  }
  
}
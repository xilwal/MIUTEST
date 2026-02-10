import java.util.*;

public class Main {
  public static void main(String[] args) {
  	int[] a = {36,-28};
    System.out.println(isComplete(a));
  }
  
  public static int isComplete(int[] a){
  	int length = a.length;
    int isEven = 0, isPerfect = 0, isSumEight = 0;
    if(length < 2) return 0;
    
    for(int i = 0; i < length; i++){
    	int num = a[i];
        if(num%2 == 0){
        	isEven = 1;
        }
        
        for(int j = 1; j * j <= num; j++){
        	if(j*j==num){
            	isPerfect = 1;
            }
        }
        for(int k = i+1; k < length; k++){
        	if(num + a[k] == 8){
            	isSumEight = 1;
            }
        }
    }
    if(isEven == 1 && isPerfect == 1 && isSumEight == 1){
    	return 1;
    }
        
    return 0; 
  }
}
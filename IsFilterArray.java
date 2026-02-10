public class Main {
  public static void main(String[] args) {
    int[] a = {4,13,7};
    System.out.println(isFilter(a));
  }
  public static int isFilter(int[] a){
  	if(a.length < 1){
    	return 0;
    }
    int hasNine = 0, hasEleven = 0, hasSeven = 0, hasThirteen = 0;
    for(int i = 0; i < a.length; i++){
    	if(a[i]== 9){
        	hasNine = 1;
        }else if(a[i] == 11){
        	hasEleven = 1;
        }else if(a[i] == 7){
        	hasSeven = 1;
        }else if(a[i] == 13){
        	hasThirteen = 1;
        }
    }
    if((hasNine == 1 && hasEleven == 0) || (hasSeven == 1 && hasThirteen == 1)){
    	return 0;
    }
    return 1;
  }
}

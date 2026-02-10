public class Main {
  public static void main(String[] args) {
    System.out.println(countOnes(15));
  }
  public static int countOnes(int n){
  	if(n < 1){
    	return 0;
    }
    int num = n;
    int oneCount = 0;
    while(num > 0){
    	int digit = num%2;
        num=num/2;
        if(digit == 1){
        	oneCount++;
        }
    }
    return oneCount;
  }
}

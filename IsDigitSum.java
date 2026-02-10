public class Main {
  public static void main(String[] args) {
    int[] a = {4,13,7};
    System.out.println(isDigitSum(32121,9));
  }
  public static int isDigitSum(int n, int m){
  	int sum = 0;
    int num = n;
    int digit = 0;
    while(num > 0){
    	digit = num%10;
        num = num/10;
        sum = sum + digit;
    }
    if(sum < m){
    	return 1;
    }
    return 0;
  }
}

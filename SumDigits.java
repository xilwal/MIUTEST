public class Main {
  public static void main(String[] args) {
    System.out.println(sumDigits(-6543)); //output 18
  }
  
  public static int sumDigits(int n){
  	
   	if(n < 0){
    	n = n * -1;
    }
   	int num = n;
    int sum = 0;
   	while(num > 0){
        sum = sum + num%10;
        num = num/10;
    }
  	return sum;
    
  }
}

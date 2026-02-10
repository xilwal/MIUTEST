public class Main {
  public static void main(String[] args) {
    System.out.println(factorTwoCount(64)); //output
  }
  
  public static int factorTwoCount(int n){
  	
    if(n < 1)
  		return 0;
        
  	int countTwo = 0, num = n;
    
   	while(num > 0){
    	if(num%2 == 0){
        	countTwo++;
            num = num/2;
        }else{
        	break;
        }
    }
  	return countTwo;
    
  }
}

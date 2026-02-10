public class Main {

    public static void main(String[] args) {
        
        System.out.println(checkConcatenatedSum(198,2));
        System.out.println(checkConcatenatedSum(2997,3));
    }

    public static int checkConcatenatedSum(int n, int catlen) {
        
        if(n < 0 && catlen < 0)
        	return 0;
            
		int digit = 0;
        int num = n;
        int totalSum = 0;
        
        while(num > 0){
        	digit = num%10;
            int sum = digit;
            for(int i = 1; i < catlen; i++){
            	sum = sum * 10 + digit;
            }
            totalSum = totalSum + sum;
            num = num/10;
       	}
        
        if(totalSum == n)
        	return 1;
        return 0;
    }
}

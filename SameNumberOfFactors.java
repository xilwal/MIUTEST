public class Main{
    
     public static void main(String[] args) {
        System.out.println(sameNumberOfFactors(6, 21)); // Output: 1
        System.out.println(sameNumberOfFactors(-20, 22)); // Output: -1
        System.out.println(sameNumberOfFactors(8, 12)); // Output: 0
        System.out.println(sameNumberOfFactors(5, 5)); // Output: 1
        System.out.println(sameNumberOfFactors(0, 0)); // Output: 1
        System.out.println(sameNumberOfFactors(1, 0)); // Output: 0
    }

    public static int sameNumberOfFactors(int n1, int n2) {
        
        if (n1 < 0 || n2  < 0)
            return -1;
        
        if (n1 == n2) 
             return 1;

        int n1FactorsCount = 0;
        int n2FactorsCount = 0;
        
        for (int i = 1; i <= n1; i++) {
            if(n1%i == 0)
            	n1FactorsCount++;
        }
        for (int j = 1; j <= n2; j++) {
            if(n2%j == 0)
            	n2FactorsCount++;
        }
        if(n1FactorsCount == n2FactorsCount)
        	return 1;
        return 0;
    }
}
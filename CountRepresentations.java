public class Main {
  public static void main(String[] args) {
    System.out.println(countRepresentations(4)); //output 15
    System.out.println(countRepresentations(1)); //output 1
  }
  
  public static int countRepresentations(int numRupees){
  	
    if(numRupees < 1)
    	return 0;
        
   if(numRupees == 1)
   		return 1;
    
    int sum20 = 0;
    int sum10 = 0;
    int sum5 = 0;
    int sum2 = 0;
    int sum1 = 0;
    int totalSum = 0;
    int count = 0;
    
    for(int rupee20 = 0; rupee20 <= numRupees/20 + 1; rupee20++){
    	
    	sum20 = 20*rupee20;
        for(int rupee10 = 0; rupee10 <= numRupees/10 + 1; rupee10++){
        	sum10 = 10*rupee10;
            for(int rupee5 = 0; rupee5 <= numRupees/5 + 1; rupee5++){
            	sum5 = 5*rupee5;
            	for(int rupee2 = 0; rupee2 <= numRupees/2 + 1; rupee2++){
                	sum2 = 2*rupee2;
                    for(int rupee1 = 0; rupee1 <= numRupees; rupee1++){
                    	sum1 = 1*rupee1;
                        totalSum = sum20+sum10+sum5+sum2+sum1;
                        if(totalSum == numRupees)
                        	count++;
                    }
                }
            }
        }
   	}              
    return count;
  }
}
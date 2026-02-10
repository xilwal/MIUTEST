public class Main {

    public static void main(String[] args) {
        // Examples
        
        System.out.println(isZeroPlentiful(new int[]{1, 2, 0, 0, 0,2, -18, 0, 0, 0, 0,12})); // Output: 2
    }

    static int isZeroPlentiful(int[] a) {
        int count = 0;
        int sequenceCount = 0;

        for(int i = 0; i < a.length; i++) {
           
           if(a[i] == 0){
            	count++;
                if(count == 4){
            		sequenceCount++;
                }
            }else{
            	if(count != 0 && count < 4)
                	return 0;
                count = 0;
            }
        }

        return sequenceCount;
    }
}

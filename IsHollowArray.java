public class Main {
 
 	public static void main(String[] args) {
  		int[] a = {1,2,3,4,0,0,0,0,3,1,4,3};
    	System.out.println(isHollow(a));
  	}
  
  	public static int isHollow(int[] a){
  
  		if(a.length < 3 || a[a.length/2] != 0 || a[(a.length/2)-1] != 0 || a[(a.length/2)+1] != 0 || a[0] == 0 || a[a.length-1] == 0) return 0;
    
    	int nonZeroCountBeforeZero = 0;
        int zeroCount = 0;
        int nonZeroCountAfterZero = 0;

        for(int i = 0; i < a.length; i++){
            if(a[i] != 0 && zeroCount == 0)
                nonZeroCountBeforeZero++;
            else if(a[i] == 0 && nonZeroCountBeforeZero > 0)
                zeroCount++;
            else if(a[i] != 0 && zeroCount > 2)
                nonZeroCountAfterZero++;
            else
                return 0;
        }
        if(nonZeroCountBeforeZero != nonZeroCountAfterZero || zeroCount < 3)
            return 0;
        return 1;
  }
}
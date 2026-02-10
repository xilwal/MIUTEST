public class Main {
    public static void main(String[] args) {
        int[] a = {1,2, 3, 6, 4, 5, 6,8,-2,7,0,-1};
        System.out.println(isComplete(a)); //output 1
    }
    
    public static int isComplete(int[] a){
        
        if(a.length < 2) return 0;
        
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        
        for(int i = 0; i < a.length; i++){
            if(a[i]%2 == 0){
                if(a[i] > max){
                	max = a[i];
                }
                if(a[i] < min){
                	min = a[i];
                }
            }
        }
        if(min == max){
            return 0;
        }
        
        for(int j = min; j < max; j++){
        	int found = 0;
            for(int k = 0; k < a.length; k++){
            	if(a[k] == j){
                	found = 1;
                    break;
                }
            }
            if(found == 0) return 0;
            
        }
        return 1;
    }
}
public class Main {
    public static void main(String[] args) {
        int[] a = {-1,1,-3,1,3};
        System.out.println(isBalanced(a)); //output 1
    }
    
    public static int isBalanced(int[] a){
        if(a.length == 0) return 0;

        for(int i = 0; i < a.length; i++){
            
            if(a[i] < 0){
                int found = 0;
                for(int j = i+1; j < a.length; j++){
                    if(-a[i]== a[j]){
                        found = 1;
                        break;
                    }
                }
                if(found == 0) return 0;
            }
        }
        return 1;
    }
}
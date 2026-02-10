public class Main {
    public static void main(String[] args) {
        int[] a = {2, 3, 4, 5, 6, 7, 8};
        System.out.println(isBalanced(a)); //output 1
    }
    
    public static int isBalanced(int[] a){
        if(a.length < 1) return 0;
        
       
        for(int i = 0; i < a.length; i++){
            if(i%2 == 0 && a[i]%2 == 1)
            	return 0;
            if(i%2 == 1 && a[i]%2 == 0)
            	return 0;
        }
       
        return 1;
    }
}
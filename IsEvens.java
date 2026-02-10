public class Main {
    public static void main(String[] args) {
        int[] a = {1,3,3,2};
        System.out.println(isEvens(234)); //output 1
    }
    
    public static int isEvens(int n){

       	int num = n;
        while(num>0){
        	int digit = num%10;
            if(digit%2 == 1) return 0;
            num = num/10;
        }
        return 1;
    }
}
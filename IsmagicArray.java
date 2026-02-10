public class Main {
    public static void main(String[] args) {
        int[] a = {21, 3, 7, 9, 11, 4, 6};
        System.out.println(isMagicArray(a)); //output 1
    }
    
    public static int isMagicArray(int[] a){
        int sum = 0;
        for(int i = 0; i < a.length; i++){
            if(isPrime(a[i]) == 1){
                sum = sum + a[i];
            }
        }
        if(sum == a[0] ){
            return 1;
        }
        return 0;
    }

    static int isPrime(int n){
        if(n<2)
            return 0;
        for(int i = 2; i < n; i++){
            if(n%i == 0)
                return 0;
        }
        return 1;
    }
}
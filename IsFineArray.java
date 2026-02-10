public class Main {
    public static void main(String[] args) {
        int[] a = {1,3,3,2};
        System.out.println(isFineArray(a)); //output 1
    }
    
    public static int isFineArray(int[] a){
        int fineNum = 0;
        for(int i = 0; i < a.length; i++){
            if(isPrime(a[i]) == 1 && fineNum == 0){
                fineNum = a[i];
            }
            if(isPrime(a[i]) == 1 && fineNum > 0){
                if(a[i]+2 == fineNum || a[i]-2 == fineNum){
                    return 1;
                }
            }
        }
        if(fineNum==0){
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
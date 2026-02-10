public class Main {
    public static void main(String[] args) {
//        int[]a = {1, 2, 19, 4, 5};
//        int[]a = {1, 2, 3, 4, 4};
//        int[]a = {1, 3, 9, 8};
       int[]a = {2};
//        int[]a = {};
        System.out.println(isOnionArray(a));

    }
    public static int isOnionArray(int[] a){
        
        int k = 0;

        for (int i = 0; i < a.length; i++) {
            k = a.length-1 - i;
            if(i!=k){
                if(a[i] + a[k]>10){
                    return 0;
                }
            }
        }
        return 1;

    }
}
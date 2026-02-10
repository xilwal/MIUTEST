public class SubArray {

    public static void main(String[] args) {
        int[] arr1 = {13,6,3,2};
        int[] arr2 = {11,5,3,2};

        System.out.println(isSub(arr1)); //output 1
        System.out.println(isSub(arr2)); //output 0
    }

    public static int isSub(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            int sum = 0;
            for (int j = i + 1; j < a.length; j++) {
                sum += a[j];
            }
            if (!(a[i] > sum)) {
                return 0;
            }
        }
        return 1;
    }
}
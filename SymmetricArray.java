public class SymmetricArray {

    public static void main(String[] args) {
        int[] arr1 = {2, 7, 9, 10, 11, 5, 8};
        int[] arr2 = {9, 8, 7, 13, 14, 17};
        int[] arr3 = {2, 7, 8, 9, 11, 13, 10};

        System.out.println(isSym(arr1)); // Output: 1
        System.out.println(isSym(arr2)); // Output: 1
        System.out.println(isSym(arr3)); // Output: 0
    }

    public static int isSym(int[] a) {
        int left = 0;
        int right = a.length - 1;

        while (left < right) {
            if (a[left] % 2 != a[right] % 2) {
                return 0;
            }
            left++;
            right--;
        }
        return 1;
    }
}
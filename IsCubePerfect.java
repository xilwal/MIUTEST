public class Main {

    public static void main(String[] args) {
        int[] array1 = {-1, 1, -8, -27, 8};
        int[] array2 = {1, 0};
        int[] array3 = {1, 1};
        int[] array4 = {9};
        int[] array5 = {1, 0, 1, 1, 0, 1, 1, 0, 1, 1, 0};
        int[] array6 = {};

        System.out.println(isCubePerfect(array1)); // Output: 0
        System.out.println(isCubePerfect(array2)); // Output: 1
        System.out.println(isCubePerfect(array3)); // Output: 0
        System.out.println(isCubePerfect(array4)); // Output: 1
        System.out.println(isCubePerfect(array5)); // Output: 1
        System.out.println(isCubePerfect(array6)); // Output: 1
    }

    static int isCubePerfect(int[] a) {
        // Check if the array is empty
        if (a.length == 0) {
            return 1;
        }

        // Iterate through the array
        for (int i = 0; i < a.length; i++) {
            int isCube = 0;
            if(a[i]<0)
                a[i]=a[i]*-1;
                
            for(int j = 1; j*j*j <= a[i]; j++){
                int cube = j*j*j;
                if(cube == a[i])
                    isCube = 1;
            }
            if(isCube == 0)
                return 0;
        }
        return 1;
    }
}

public class Main {

    public static void main(String[] args) {
        // Examples
        int[] array1 = {9, -9};
        int n1 = 0;
        int[] result1 = filterArray(array1, n1);
        printResult(array1, n1, result1);

        int[] array2 = {9, -9};
        int n2 = 1;
        int[] result2 = filterArray(array2, n2);
        printResult(array2, n2, result2);

        int[] array3 = {9, -9};
        int n3 = 2;
        int[] result3 = filterArray(array3, n3);
        printResult(array3, n3, result3);

        int[] array4 = {9, -9};
        int n4 = 3;
        int[] result4 = filterArray(array4, n4);
        printResult(array4, n4, result4);

        int[] array5 = {8, 4, 9, 0, 3, 1, 2};
        int n5 = 88;
        int[] result5 = filterArray(array5, n5);
        printResult(array5, n5, result5);

        int[] array6 = {9, -9, 5};
        int n6 = 3;
        int[] result6 = filterArray(array6, n6);
        printResult(array6, n6, result6);

        int[] array7 = {0, 9, 12, 18, -6};
        int n7 = 11;
        int[] result7 = filterArray(array7, n7);
        printResult(array7, n7, result7);
    }

    public static int[] filterArray(int[] a, int n) {
        int count = 0;
        int tempN = n;
        while (tempN > 0) {
            count += tempN % 2;
            tempN /= 2;
        }

        int[] result = new int[count];
        int resultIndex = 0;
       
        for (int i = 0; i < a.length; i++) {
            
            if (n % 2 == 1 ) {
                result[resultIndex++] = a[i];
            }
            n /= 2;
        }
        
        return result;
    }

    public static void printResult(int[] a, int n, int[] result) {
        System.out.print("if a is " + arrayToString(a) + " and n is " + n + " return ");
        if (result == null) {
            System.out.println("null");
        } else {
            System.out.println(arrayToString(result));
        }
    }

    public static String arrayToString(int[] arr) {
        StringBuilder sb = new StringBuilder("{");
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
            if (i < arr.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("}");
        return sb.toString();
    }
}

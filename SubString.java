public class SubstringFunction {

    public static void main(String[] args) {
        char[] array1 = {'a', 'b', 'c'};
        char[] array2 = {};
        char[] array3 = {'a', 'b', 'c'};

        System.out.println(new String(substring(array1, 0, 4))); // Output: null
        System.out.println(new String(substring(array1, 0, 3))); // Output: abc
        System.out.println(new String(substring(array1, 0, 2))); // Output: ab
        System.out.println(new String(substring(array1, 0, 1))); // Output: a
        System.out.println(new String(substring(array1, 1, 3))); // Output: null
        System.out.println(new String(substring(array1, 1, 2))); // Output: bc
        System.out.println(new String(substring(array1, 1, 1))); // Output: b
        System.out.println(new String(substring(array1, 2, 2))); // Output: null
        System.out.println(new String(substring(array1, 2, 1))); // Output: c
        System.out.println(new String(substring(array1, 3, 1))); // Output: null
        System.out.println(new String(substring(array1, 1, 0))); // Output: ""
        System.out.println(new String(substring(array1, -1, 2))); // Output: null
        System.out.println(new String(substring(array1, -1, -2))); // Output: null
        System.out.println(new String(substring(array2, 0, 1))); // Output: null
    }

    public static char[] substring(char[] a, int start, int len) {
        if (start < 0 || len < 0 || start >= a.length || start + len - 1 >= a.length) {
            return null;
        }

        char[] result = new char[len];
        for (int i = 0; i < len; i++) {
            result[i] = a[start + i];
            System.out.println(a[i])
        }
        return result;
    }
}
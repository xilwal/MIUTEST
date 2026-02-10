public class EvenSpaced {

    public static void main(String[] args) {
        int[] arr1 = {1100,19,131,140};
        int[] arr2 = {200,10,151,160};
        int[] arr3 = {100,19,-131,-140};

        System.out.println(isEvenSpaced(arr1)); //output 1
        System.out.println(isEvenSpaced(arr2)); //output 0
        System.out.println(isEvenSpaced(arr3)); //output 1
    }

    public static int isEvenSpaced (int[] a) {
        int largestNumber = a[0];
        int smallestNumber = a[0];

        for(int i = 0; i < a.length; i++) {
            if(a[i] > largestNumber) {
                largestNumber = a[i];
            }
            if(a[i] < smallestNumber) {
                smallestNumber = a[i];
            }
        }
        int difference = largestNumber - smallestNumber;
        if(difference % 2 == 0) {
            return 1;
        }
        return 0;
    }
}

public class Main {

    public static void main(String[] args) {
        int[] mileageCounter = {9, 9, 9, 9, 9};
        int milesToAdd = 1;

        updateMileageCounter(mileageCounter, milesToAdd);
        printMileageCounter(mileageCounter);

        milesToAdd = 2;
        updateMileageCounter(mileageCounter, milesToAdd);
        printMileageCounter(mileageCounter);

        milesToAdd = 13;
        updateMileageCounter(mileageCounter, milesToAdd);
        printMileageCounter(mileageCounter);
    }

    public static void updateMileageCounter(int[] a, int miles) {
        for (int i = 0; i < miles; i++) {
            addOneToMileageCounter(a);
        }
    }

    public static void addOneToMileageCounter(int[] a) {
        int carry = 1;

        for (int i = 0; i < a.length; i++) {
            int sum = a[i] + carry;
            a[i] = sum % 10;
            carry = sum / 10;

            if (carry == 0) {
                break; // No need to carry over, exit the loop
            }
        }
    }

    public static void printMileageCounter(int[] a) {
        for (int i = a.length - 1; i >= 0; i--) {
            System.out.print(a[i]);
        }
        System.out.println();
    }
}

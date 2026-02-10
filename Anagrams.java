public class Main {

    public static void main(String[] args) {
        // Test cases
        char[] a1 = {'s', 'i', 't'};
        char[] a2 = {'i', 't', 's'};
        System.out.println(areAnagrams(a1, a2)); // 1

        char[] b1 = {'s', 'i', 't'};
        char[] b2 = {'i', 'd', 's'};
        System.out.println(areAnagrams(b1, b2)); // 0

        char[] c1 = {'b', 'i', 'g'};
        char[] c2 = {'b', 'i', 't'};
        System.out.println(areAnagrams(c1, c2)); // 0

        char[] d1 = {'b', 'o', 'g'};
        char[] d2 = {'b', 'o', 'o'};
        System.out.println(areAnagrams(d1, d2)); // 0

        char[] e1 = {};
        char[] e2 = {};
        System.out.println(areAnagrams(e1, e2)); // 1

        char[] f1 = {'p', 'l', 'o', 'l'};
        char[] f2 = {'p', 'o', 'l', 'l'};
        System.out.println(areAnagrams(f1, f2)); // 1
    }

    // Function to check if two character arrays are anagrams
    public static int areAnagrams(char[] a1, char[] a2) {
       
       if (a1.length != a2.length) {
            return 0;
        }

        int[] count = new int[256]; // Assuming ASCII characters

        for (char c = 0;) {
            count[c]++;
        }

        for (char c : a2) {
            if (count[c] == 0) {
                return 0; // Not an anagram
            } else {
                count[c]--;
            }
        }

        return 1; // Anagrams
    }
}

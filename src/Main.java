import java.util.Arrays;

public class Main {
    public static void main(String args[]) {
        reverseString("Vino");
        getOccuringChar("ABCDEFGHABCDEFGH");
//        removeDuplicates("ABCDEFGHABCDEFGH");

        char str[] = "geeksforgeeks".toCharArray();
        int n = str.length;
        removeDuplicate(str, n);
    }

    //  Reverse string
    private static void reverseString(String word) {
        String reverse = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reverse = reverse + word.charAt(i) + " ";
        }
        System.out.println(reverse);
    }

    //    Get the occurance of characters in a string
    private static void getOccuringChar(String str) {
        int[] strChar = new int[256];

        for (int i = 0; i < str.length(); i++) {
            strChar[str.charAt(i)]++;
        }
        char[] tempChar = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            int find = 0;
            tempChar[i] = str.charAt(i);
            for (int j = 0; j <= i; j++) {
                if (str.charAt(i) == tempChar[j]) {
                    find++;
                }

            }
            if (find == 1) {
                System.out.println(
                        "Number of Occurrence of "
                        + str.charAt(i)
                        + " is:" + strChar[str.charAt(i)]);
            }
        }
    }

    static void removeDuplicate(char str[], int n) {
        // Used as index in the modified string
        int index = 0;

        // Traverse through all characters
        for (int i = 0; i < n; i++) {

            // Check if str[i] is present before it
            int j;
            for (j = 0; j < i; j++) {
                if (str[i] == str[j]) {
                    break;
                }
            }

            // If not present add it to result
            if (j == i) {
                str[index++] = str[i];
            }
        }
        System.out.println(Arrays.copyOf(str, index));
    }
}

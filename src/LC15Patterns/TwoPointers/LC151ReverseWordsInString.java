package LC15Patterns.TwoPointers;

import java.util.Arrays;

public class LC151ReverseWordsInString {
    public static void main(String[] args) {
        String s = " the sky is blue ";
        System.out.println(reverseWords(s));
    }

    public static String reverseWords(String s) {

        char[] characters = s.toCharArray();
        int n = characters.length;

        System.out.println("Print before reverse() "+ Arrays.toString(characters));

        reverse(characters, 0, n - 1);

        System.out.println("Print after reverse() "+ Arrays.toString(characters));

        reverseWords(characters, n);

        System.out.println("Print after reverseWords() "+ Arrays.toString(characters));

        return cleanSpaces(characters, n);

    }

    public static void reverse(char[] charArr,int i,int j){
        while (i < j) {
            char t = charArr[i];
            charArr[i++] = charArr[j];
            charArr[j--] = t;
        }
    }

    public static void reverseWords(char[] charArr,int n) {
        int i = 0, j = 0;

        while (i < n) {
            while (i < j || i < n && charArr[i] == ' ') i++;
            while (j < i || j < n && charArr[j] != ' ') j++;
            reverse(charArr, i, j - 1);
        }

    }

    public static String cleanSpaces(char[] charArr, int n) {
        int i = 0, j = 0;

        while (j < n) {
            while (j < n && charArr[j] == ' ') j++;
            while (j < n && charArr[j] != ' ') charArr[i++] = charArr[j++];
            while (j < n && charArr[j] == ' ') j++;
            if (j < n) charArr[i++] = ' ';
        }

        return new String(charArr).substring(0, i);
    }

}

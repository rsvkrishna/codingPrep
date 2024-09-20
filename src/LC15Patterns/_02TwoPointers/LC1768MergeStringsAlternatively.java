package LC15Patterns._02TwoPointers;

public class LC1768MergeStringsAlternatively {
    public static void main(String[] args) {
        String word1 = "abc", word2 = "pqr";
        System.out.println(mergeAlternately(word1,word2));

    }

    public static String mergeAlternately(String word1, String word2) {
        StringBuilder newStr = new StringBuilder();
        int m = word1.length();
        int n = word2.length();

        for(int i =0;i< m || i <n; i++){
            if(i<m)
                newStr.append(word1.charAt(i));
            if(i<n)
                newStr.append(word2.charAt(i));
        }

        return newStr.toString();
    }
}

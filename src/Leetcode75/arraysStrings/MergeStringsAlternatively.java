package Leetcode75.arraysStrings;

public class MergeStringsAlternatively {

    public static void main(String[] args) {
        MergeStringsAlternatively a = new MergeStringsAlternatively();
        //String word1 = "abc",  word2 = "pqr";
        String word1 = "ab", word2 = "pqrs";

        System.out.println(a.mergeAlternately(word1,word2));


    }

    public String mergeAlternately(String word1, String word2) {

        StringBuilder newWord = new StringBuilder();

        int m = word1.length(),  n = word2.length();

        for(int i =0; i<m || i<n; ++i){
            if(i<m)
                newWord.append(word1.charAt(i));
            if(i<n)
                newWord.append((word2.charAt(i)));
        }
       return newWord.toString();
    }
}

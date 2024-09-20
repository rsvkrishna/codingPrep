package LC15Patterns.TwoPointers;

public class LC392IsSubsequence {
    public static void main(String[] args) {
        String s = "abc", t = "ahbgdc";
        System.out.println(isSubsequence(s,t));

    }

    public static boolean isSubsequence(String s, String t) {
        char[] str1= s.toCharArray();
        char[] str2= t.toCharArray();

        int i=0;int j=0;

        while(i<str1.length && j<str2.length){
            if(str1[i]==str2[j]){
                i++;
                j++;
            }
            else
                j++;
        }
        return i == str1.length;
    }
}

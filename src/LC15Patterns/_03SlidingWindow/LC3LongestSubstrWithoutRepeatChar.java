package LC15Patterns._03SlidingWindow;

import java.util.HashSet;
import java.util.Set;

public class LC3LongestSubstrWithoutRepeatChar {
    public static void main(String[] args) {
        String s = "pwwkew";
        System.out.println(lengthOfLongestSubstring(s));
        System.out.println(lengthOfLongestSubstring2(s));

    }

    public static int lengthOfLongestSubstring(String s) {
        int maxLength =0;

        Set<Character> charSet = new HashSet<>();
        int i =0; int j =0;

        while(j<s.length()){
            char currChar = s.charAt(j);
            if(charSet.contains(currChar)){
                charSet.remove(s.charAt(i));
                i++;
            } else {
                charSet.add(currChar);
                maxLength = Math.max(maxLength, charSet.size());
                j++;
            }
        }

        return maxLength;
    }

    public static int lengthOfLongestSubstring2(String s) {

        int p1=0;int p2=0;int max=0;
        HashSet<Character> hs=new HashSet();
        while(p2<s.length()){

            if(!hs.contains(s.charAt(p2))){
                hs.add(s.charAt(p2));
                p2++;
                max=Math.max(hs.size(),max);
            } else{
                hs.remove(s.charAt(p1));
                p1++;
            }

        }
        return max;
    }
}

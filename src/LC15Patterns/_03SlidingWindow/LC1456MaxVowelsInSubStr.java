package LC15Patterns._03SlidingWindow;

import java.util.HashSet;

public class LC1456MaxVowelsInSubStr {
    public static void main(String[] args) {
        String s = "abciiidef";
        int k = 3;

        System.out.println(maxVowels(s,k));
    }

    public static int maxVowels(String s, int k) {
        int i=0,j=0,count=0,maxCount=0;

        while(j<s.length()){
            if((j-i+1) <k ){
                if(isVowels(s.charAt(j)))
                    count++;
                j++;
                maxCount= Math.max(maxCount,count);
            }
            else if((j-i+1) ==k ){
                if(isVowels(s.charAt(j)))
                    count++;
                maxCount= Math.max(maxCount,count);
                if(isVowels(s.charAt(i)))
                    count--;
                i++;
                j++;

            }
        }


        return maxCount;
    }

    public static boolean isVowels(char c){
        return c =='a'|| c== 'e' || c =='i'|| c == 'o' || c == 'u';
    }
}

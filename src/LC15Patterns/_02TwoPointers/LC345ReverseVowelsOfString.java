package LC15Patterns._02TwoPointers;

public class LC345ReverseVowelsOfString {
    public static void main(String[] args) {
        String s = "hello";
        System.out.println(reverseVowels(s));

    }

    public static String reverseVowels(String s) {

        boolean[] isVowels = new boolean[128];
        for(char c : "aeiouAEIOU".toCharArray())
            isVowels[c]=true;

        char[] characters = s.toCharArray();
        int start=0,end=s.length()-1;

        while (start < end){
            while (start < end && !isVowels[characters[start]])
                start++;
            while(start < end && !isVowels[characters[end]])
                end--;

            if(start < end){
                char temp = characters[start];
                characters[start]=characters[end];
                characters[end]=temp;

                start++;
                end--;
            }
        }

        return String.valueOf(characters);
    }

}

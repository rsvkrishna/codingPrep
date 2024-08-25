package Leetcode75.arraysStrings;

public class GreatestCommonDivisor {
    public static void main(String[] args) {

        GreatestCommonDivisor gcd= new GreatestCommonDivisor();

        System.out.println(gcd.gcdOfStrings("ABCABC","ABC"));
        System.out.println(gcd.gcdOfStrings("ABABAB","ABAB"));
        System.out.println(gcd.gcdOfStrings("LEET","CODE"));
        System.out.println(gcd.gcdOfStrings("ABC","ABCABC"));
        
    }

    public String gcdOfStrings(String str1, String str2) {

        if(str2.length() > str1.length())
            return gcdOfStrings(str2,str1);

        if(str2.equals(str1))
            return str1;

        if(str1.startsWith(str2))
            return gcdOfStrings(str1.substring(str2.length()),str2);

        return "";
    }
}

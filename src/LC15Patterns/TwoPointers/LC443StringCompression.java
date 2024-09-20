package LC15Patterns.TwoPointers;

import java.util.ArrayList;
import java.util.List;

public class LC443StringCompression {
    public static void main(String[] args) {
        char[] chars = {'a','a','b','b','c','c','c'};
        //char[] chars = {'a','b','b','b','b','b','b','b','b','b','b','b','b'};
        System.out.println(compressInitial(chars));
        System.out.println(compress(chars));
    }

    public static int compressInitial(char[] chars) {
        List<Object> str = new ArrayList();
        str.add(chars[0]);
        int count =1;

        for(int i =1;i< chars.length;i++){
            char curr = chars[i];
            char prev = chars[i-1];

            if(curr != prev){
                if(count != 1)
                    str.add(count);
                str.add(curr);
                count =0;
            }

            count++;

        }
        if(count != 1)
            str.add(count);
        System.out.println(str.toString());
        return str.size();
    }

    public static int compress(char[] chars) {
        int indexAns = 0, index = 0;
        while(index < chars.length){
            char currentChar = chars[index];
            int count = 0;
            while(index < chars.length && chars[index] == currentChar){
                index++;
                count++;
            }
            chars[indexAns++] = currentChar;
            if(count != 1)
                for(char c : Integer.toString(count).toCharArray())
                    chars[indexAns++] = c;
        }
        return indexAns;
    }
}

package Leetcode75.arraysStrings;

import java.util.ArrayList;
import java.util.List;

public class GreatestNumberOfCandies {
    public static void main(String[] args) {
        int[] candies = {2,3,5,1,3};
        int extraCandies = 3;

        GreatestNumberOfCandies g1=new GreatestNumberOfCandies();
        List<Boolean> result = g1.kidsWithCandies(candies,extraCandies);

        System.out.println(result);

    }

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        int mx=0;
        for(int candy : candies){
            mx=Math.max(mx,candy);
        }

        List<Boolean> result = new ArrayList<Boolean>();

        for(int candy : candies){
            result.add(candy+extraCandies >= mx);
        }

        return result;
    }
}

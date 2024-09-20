package LC15Patterns._02TwoPointers;

public class LC11ContainerWithMostWater {
    public static void main(String[] args) {

        int[] arr={1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(arr));

    }

    public static int maxArea(int[] height) {

        int i=0;int j= height.length-1;
        int maxVol =0;

        while(i<j){
            maxVol = Math.max(maxVol,(j-i)*Math.min(height[i],height[j]));
            if(height[i]<height[j])
                i++;
            else
                j--;
        }

        return maxVol;
    }
}

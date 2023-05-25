// this function return sum of max and min in an array after finding them 

class Solution {
    public int minmax(int[] nums) {
        if(nums.length == 0) return -1; //empty array

        int min = 0;
        int max = 0;
        for(int i = 0; i<nums.length ; i++){
            if(nums[i]<nums[min]){
                min = i;
            }
            if(nums[i]>nums[max]){
                max = i;
            }
        }
        return nums[max]+nums[min];
    }
}


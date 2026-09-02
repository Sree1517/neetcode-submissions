class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            for(int l=i+1;l<nums.length;l++){
                if(nums[i]+nums[l]==target){
                    return new int[]{i,l};
                }
    
            }
        }
        return new int[]{};
    }
}
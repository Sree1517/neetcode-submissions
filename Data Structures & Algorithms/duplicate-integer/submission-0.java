class Solution {
    public boolean hasDuplicate(int[] nums) {
        int ptr;
        for(int i=0;i<nums.length;i++){
            ptr=i+1;
            while(ptr<nums.length){
                if(nums[i]==nums[ptr]){
                    return true;
                }
                ptr++;
            }
        }
        return false;
    }
}
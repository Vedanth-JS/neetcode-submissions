class Solution {
    public int findMin(int[] nums) {
        int min=nums[0];
        for(int i:nums){
            if(min>i){
                min=i;;
            }
        }
        return min;
        
    }
}

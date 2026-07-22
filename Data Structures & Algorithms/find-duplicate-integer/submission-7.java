class Solution {
    public int findDuplicate(int[] nums) {
        
        // Arrays.sort(nums);
        // for(int i = 1;i<nums.length;i++){
        //     if(nums[i] == nums[i-1]){
        //         return nums[i];
        //     }
        // }
        // return -1;

        HashSet<Integer> set = new HashSet<>();

        for(int i = 0;i<nums.length;i++){
            if(set.contains(nums[i])){
                return nums[i];
            }
            set.add(nums[i]);
        }
        return -1;


    }
}

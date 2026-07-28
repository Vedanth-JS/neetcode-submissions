class Solution {
    public int search(int[] nums, int target) {
        int l=0, r=nums.length-1;

        while(l<r){
            int mid = (l+r)/2;
            if(nums[mid]<nums[r]){
                r=mid;
            }
            else{
                l=mid+1;
            }
        }

        int pivot = l;

        int res1 = bs(0,pivot-1,target, nums);
        if(res1!=-1) return res1;
        return bs(pivot, nums.length-1, target, nums);
    }

    public int bs(int l, int r, int target, int[] nums){
        while(l<=r){
            int mid = (r+l)/2;
            if(nums[mid]<target){
                l=mid+1;
            }
            else if(nums[mid]>target){
                r=mid-1;
            }
            else return mid;
        }
        return -1;
    }
}

class Solution {
    public int maxProfit(int[] nums) {
        int re=0;
        for(int i=0;i<nums.length;i++){
            int buy=nums[i];
        for(int j=i+1;j<nums.length;j++){
            int profit=nums[j];
            int p=profit-buy;
             re=Math.max(re,p);
        }
        }
        return re;

        
    }
}

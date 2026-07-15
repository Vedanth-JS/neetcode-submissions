class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> it=new HashSet<>();
        int n=nums.length;
        for(int i=0;i<n-2;i++){
            for(int j=i+1;j<n-1;j++){
                for(int k=j+1;k<n;k++)
                {

                    if(nums[i]+nums[j]+nums[k]==0){
                        List<Integer> list=Arrays.asList(nums[i],nums[j],nums[k]);
                        Collections.sort(list);
                        it.add(list);
                    }
                }
            }
        }
        return new ArrayList<>(it);
    }
}

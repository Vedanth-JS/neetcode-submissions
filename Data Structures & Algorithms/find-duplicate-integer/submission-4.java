class Solution {
    public int findDuplicate(int[] nums) {
       Set<Integer> m=new HashSet<>();
       for(int num:nums){
        if(m.contains(num))
            return num;
       
       m.add(num);
       }
       return -1;
        
    }
}

class Solution {
    List<List<Integer>> result;
    public List<List<Integer>> subsets(int[] nums) {
        result = new ArrayList<>();
        backtrack(0, nums, new ArrayList<>(), result);
        return result;
    }

    void backtrack(int index, int[] nums, List<Integer> currList,List<List<Integer>> result) {
        result.add(new ArrayList<>(currList));
        if (index == nums.length) {
            return;
        }
        for (int i = index; i < nums.length; i++) {
            int num = nums[i];
            currList.add(num);
            backtrack(i + 1, nums, currList, result);
            currList.remove(currList.size() - 1);
        }
    }
}
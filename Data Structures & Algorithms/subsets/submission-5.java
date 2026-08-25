 class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        dfs(nums, 0, ans, new ArrayList<>());
        return ans;
    }

    private void dfs(int[] nums, int idx, List<List<Integer>> ans, List<Integer> subAns) {
        if (idx >= nums.length) {
            ans.add(new ArrayList<>(subAns));
            return;
        }
        subAns.add(nums[idx]);
        dfs(nums, idx + 1, ans, subAns);

        subAns.remove(subAns.size() - 1);
        dfs(nums, idx + 1, ans, subAns);
    }
 }
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        // return nativeApproach(nums);

        // nums.sort();
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();

        for (int i = 0; i < nums.length - 2; i++) {
            int left = i + 1;
            int right = nums.length - 1;

            if (i != 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (sum == 0) {
                    list.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    right--;
                    while (left < right && nums[left] == nums[left - 1]) {
                        left++;
                    }
                    // Skip duplicates for right
                    while (left < right && nums[right] == nums[right + 1]) {
                        right--;
                    }
                } else if (sum > 0) {
                    right--;
                } else if (sum < 0) {
                    left++;
                }
            }
        }
        return list;
    }

    public List<List<Integer>> nativeApproach(int[] nums) {
        Set<List<Integer>> list = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        List<Integer> tempList = new ArrayList<>();
                        tempList.add(nums[i]);
                        tempList.add(nums[j]);
                        tempList.add(nums[k]);

                        List<Integer> tmp = Arrays.asList(nums[i], nums[j], nums[k]);
                        list.add(tempList);
                    }
                }
            }
        }
        return new ArrayList<>(list);
    }
}

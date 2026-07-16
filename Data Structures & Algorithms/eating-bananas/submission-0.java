class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = 0;

        for (int pile : piles) {
            high = Math.max(high, pile);
        }

        int res = high;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            int time = 0;
            for (int pile : piles) {
                time += (int) Math.ceil((double) pile / mid);
            }

            if (time <= h) {
                res = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return res;
    }
}
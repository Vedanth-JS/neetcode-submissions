class Solution {
    private Set<Integer> seen = new HashSet<>();
    public boolean isHappy(int n) {
        if (n == 1) return true;
        int newNumber = 0;
        while (n > 0) {
            int d = n % 10;
            newNumber += d * d;
            n = n / 10;
        }
        if (!seen.add(newNumber)) return false;
        return isHappy(newNumber);
    }
}

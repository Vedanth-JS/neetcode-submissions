
class Solution {
    public boolean isHappy(int n) {
        Set<Integer> seen = new HashSet<>();
        
        // Loop until n becomes 1 or enters a cycle
        while (n != 1 && !seen.contains(n)) {
            seen.add(n);
            
            // Calculate sum of squares of digits
            int sum = 0;
            while (n > 0) {
                int digit = n % 10;
                sum += digit * digit;
                n /= 10;
            }
            n = sum; // Update n to the new sum
        }
        
        return n == 1;
    }
}
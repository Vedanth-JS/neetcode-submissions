class Solution {
    public int[] plusOne(int[] digits) {
        // Iterate from the last digit backwards
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits; // No carry needed, we are done
            }
            digits[i] = 0; // Carry over to the preceding digit
        }
        
        // If all digits were 9 (e.g., [9, 9, 9]), we need a new array of size n + 1
        int[] result = new int[digits.length + 1];
        result[0] = 1; // Default values are 0, producing [1, 0, 0, 0]
        return result;
    }
}
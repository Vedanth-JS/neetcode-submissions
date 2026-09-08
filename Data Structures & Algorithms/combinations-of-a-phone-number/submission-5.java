class Solution {
    public List<String> letterCombinations(String digits) {
        if(digits.isEmpty()) {
            return new ArrayList<>();
        }
        List<String> result = new ArrayList<>();
        result.add("");
        String[] convert = {
            "","","abc","def","ghi","jkl","mno","qprs","tuv","wxyz"
        };
        for(char digit : digits.toCharArray()){
            List<String> temp = new ArrayList<>();
            for(String str: result){
                for(char c : convert[digit - '0'].toCharArray()){
                    temp.add(str + c);
                }
            }
            result = temp;
        }
        return result;
    }
}

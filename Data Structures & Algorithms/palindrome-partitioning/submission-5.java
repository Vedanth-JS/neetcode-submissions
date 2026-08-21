class Solution {
    public List<List<String>> partition(String s) {
        //need to have a helper method, palindrome checker.
        ArrayList<List<String>> res = new ArrayList<>();
        palindromePart(s, res, new ArrayList<>(), 0);
        return res;
    }

    private void palindromePart(String s, List<List<String>> res, List<String> cur, int pointer)
    {
        //If the next substring we will start checking for a palindrome is equal to the length
        //then there is no more substrings to check and we add the entire list to res
        //our for loop ensures we only get to this point if EVERY substring to this point has been a 
        //palindrome
        if(pointer >= s.length())
        {
            res.add(new ArrayList<>(cur));
        }
        //for loop that iterates through the string UNTIL it finds a palindrome
        //if it does, it adds it to the list, recurses through the case where that palindrome is included
        //to see if every other substring could form a palindrome
        //and, after, removes it to consider cases where a longer substring might also
        //be a palindrome
        for(int i = pointer; i < s.length(); i++)
        { 
            // System.out.println("Checking for " + s.substring(pointer, i+1));
            //if the substring is not a palindrome, there is no point in progressing through the case
            //further. EVERY SINGLE CHARACTER in the string NEEDS to be part of some palindrome
            //for it to be a valid answer.
            if(palindromeCheck(s.substring(pointer, i+1)))
            {
                cur.add(s.substring(pointer, i+1));
                palindromePart(s.substring(i + 1, s.length()), res, cur, pointer);
                cur.remove(cur.size() - 1);
            }    
        }
    }
    
    /**
     *Just a regular palindrome checker. Will be called for every substring possible
     * so that we only go through cases where there is at least one palindrome substring.
    **/
    private boolean palindromeCheck(String s)
    {
        for(int i = 0; i < s.length() / 2; i++)
        {
            if(s.charAt(i) != (s.charAt(s.length() - 1 - i)))
            {
                return false;
            }
        }
        return true;
    }
}

class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
            return false;
        
        char[] ars=s.toCharArray();
        char[] art=t.toCharArray();



        Arrays.sort(ars);
        Arrays.sort(art);
        if(Arrays.equals(ars,art))
            return true;
        return false;

    }
}

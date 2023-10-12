class Solution {
    public boolean isSubsequence(String s, String t) {
        for(char c : s.toCharArray()){
            int index = t.indexOf(c);
            if(index == -1) return false;
           t =  t.substring(index+1,t.length());
        }
        return true;
    }
}

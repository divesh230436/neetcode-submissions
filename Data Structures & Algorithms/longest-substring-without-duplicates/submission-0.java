class Solution {
    public int lengthOfLongestSubstring(String s) {
       HashSet<Character> set=new HashSet<>();
       int j=0;int len=0;
       for(int i=0;i<s.length();i++){
            while(set.contains(s.charAt(i))){
                set.remove(s.charAt(j));
                j++;

            }
            len=Math.max(len,i-j+1);
            set.add(s.charAt(i));
       }
       return len;
        
    }
}

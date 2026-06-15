class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())return false;
        
        HashMap<Character,Integer>mp=new HashMap<>();

        for(int i=0;i<s.length();i++){
                char ch = s.charAt(i);
            mp.put(ch, mp.getOrDefault(ch, 0) + 1);

        } 
        for(int i=0;i<t.length();i++){
            char h = t.charAt(i);
              if (!mp.containsKey(h) || mp.get(h) == 0) {
                return false;
            }
            
            mp.put(h, mp.get(h) - 1);
        }
        return true;

    }
}

class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length())
            return false;
        Map<Character, Integer> counter = new HashMap<>();
        for(char ch: s.toCharArray()){
            counter.put(ch, counter.getOrDefault(ch,0)+1);
        }
        for(char ch: t.toCharArray()){
            if(!counter.containsKey(ch)||counter.get(ch)==0)
                return false;
                counter.put(ch, counter.get(ch)-1);
        }
        return true;
    }
}
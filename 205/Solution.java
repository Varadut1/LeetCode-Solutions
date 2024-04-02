class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length()) return false;
        LinkedHashMap<Character, Character> map1 = new LinkedHashMap<>();
        LinkedHashMap<Character, Character> map2 = new LinkedHashMap<>();
        StringBuilder sb = new StringBuilder(s);
        for(int i = 0; i<s.length(); i++){
            if(map1.containsKey(s.charAt(i))){
                sb.setCharAt(i, map1.get(s.charAt(i)));
            }
            else{
                if(map2.containsKey(t.charAt(i))){
                    return false;
                }
                else{
                    map1.put(s.charAt(i), t.charAt(i));
                    map2.put(t.charAt(i), s.charAt(i));
                    sb.setCharAt(i, map1.get(s.charAt(i)));
                }
                
            }
        }
        return t.equals(sb.toString());
    }
}

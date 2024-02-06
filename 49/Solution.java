class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for(String i : strs){
            char [] arr = i.toCharArray();
            Arrays.sort(arr);
            map.computeIfAbsent(new String(arr), k->new ArrayList<>()).add(i);
        }
        return new ArrayList<>(map.values());
    }
}

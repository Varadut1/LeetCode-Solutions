class Solution {
    public String customSortString(String order, String s){
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
        for(int i = 0; i<s.length(); i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)+1);
        }
        StringBuilder result = new StringBuilder();
        for(int i = 0; i<order.length(); i++){
            if(map.containsKey(order.charAt(i))){
                result.append(String.valueOf(order.charAt(i)).repeat(map.get(order.charAt(i))));
                map.remove(order.charAt(i));
            }
        }
        System.out.println(result.toString());

        for(Map.Entry<Character, Integer> entry : map.entrySet()){
            result.append(String.valueOf(entry.getKey()).repeat(entry.getValue()));
        }
        return result.toString();
    }
}

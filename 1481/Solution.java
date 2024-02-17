class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i<arr.length; i++){
            int num = map.getOrDefault(arr[i], 0);
            map.put(arr[i], num+1);
        }
        ArrayList<Map.Entry<Integer, Integer>> sortarr = new ArrayList<>(map.entrySet());
        Collections.sort(sortarr, new Comparator<Map.Entry<Integer, Integer>>(){
            public int compare(Map.Entry<Integer, Integer> ent1, Map.Entry<Integer, Integer> ent2){
                return ent1.getValue().compareTo(ent2.getValue());
            }
        });
        map.clear();
        LinkedHashMap<Integer, Integer> newmap = new LinkedHashMap<>();
        for(Map.Entry<Integer, Integer> entry : sortarr){
            newmap.put(entry.getKey(), entry.getValue());
        }
        System.out.println(newmap.toString());
        int total = 0;
        for(Map.Entry<Integer, Integer> entry : newmap.entrySet()){
            while(k>0 && entry.getValue()>0){
                total = 0;
                newmap.put(entry.getKey(), entry.getValue()-1);
                k--;
            }
            if(entry.getValue()>0)
                total++;
        }
        System.out.println(newmap.toString());
        return total;
    }
}

class Solution {
    public String frequencySort(String s) {

        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
        for(int i = 0; i<s.length(); i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)+1);
        }

        PriorityQueue<Map.Entry<Character, Integer>> maxHeap = new PriorityQueue<>((a, b) -> Integer.compare(b.getValue(), a.getValue()));
        maxHeap.addAll(map.entrySet());

        String answer = "";
        while(!maxHeap.isEmpty()){
            Map.Entry<Character, Integer> entry = maxHeap.poll();
            char c = entry.getKey();
            int val = entry.getValue();
            for(int i = 0 ; i<val; i++){
                answer+=c;
            }
        }
        System.out.println(answer);
        return answer;
    }
}


// get freq map 
// sort using heap
// append answer


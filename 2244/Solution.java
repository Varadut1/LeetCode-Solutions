class Solution {
    public int minimumRounds(int[] tasks) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i<tasks.length; i++){
            int val = map.getOrDefault(tasks[i], 0);
            map.put(tasks[i], val+1);
        }
        int ans = 0;
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            int n = entry.getValue();
            while(n>1){
                if(n%3 == 0){
                    n = n-3;
                } 
                else if(n%2 == 0){
                    n = n-2;
                }
                else if(n>1){
                    n = n-3;
                }
                ans++;
            }
            if(n==1){
                return -1;
            }
        }
        return ans;
    }
}

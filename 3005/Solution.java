class Solution {
    public int maxFrequencyElements(int[] nums) {
        int freq = 0;
        int numbers = 0;
        int last = -1;
        int length = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i<length; i++){
            int value = map.getOrDefault(nums[i], 0);
            map.put(nums[i], value+1);
            if(value+1>freq){
                numbers = 1;
                freq = value+1;
                last = nums[i];    
            }
            if(value+1 == freq && nums[i]!=last){
                numbers++;
            }
        }
        return freq*numbers;
    }
}

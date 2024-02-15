class Solution {
    public long largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        long total = 0;
        for(int i = 0; i<nums.length; i++){
            total += nums[i];
        }  
        int n = nums.length;
        for(int i = n - 1; i>=2; i--){
            total -= nums[i];
            if(total > nums[i]){
                return total + nums[i];
                }
        }
        return -1;
    }
}

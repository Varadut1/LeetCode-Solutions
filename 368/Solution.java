class Solution {
    public List<Integer> largestDivisibleSubset(int[] nums) {

        int dp[] = new int[nums.length];
        Arrays.fill(dp, 1);
        Arrays.sort(nums);

        int index = 0;
        int subsetlength = 1;

        for(int i = 1; i<nums.length; i++){
            for(int j = 0; j<i; j++){
                if(nums[i]%nums[j] == 0){
                    dp[i] = Math.max(dp[i], dp[j]+1);                          //solution to problem;
                    if(subsetlength < dp[i]){
                        subsetlength = dp[i];
                        index = i;
                    }
                }
            }
        }
        List<Integer> result = new ArrayList<>();
        int val = nums[index];
        for( int i = index; i>=0; i--){
            if(val%nums[i] == 0 && dp[i] == subsetlength){
                result.add(nums[i]);
                subsetlength--;
                val = nums[i];
            }
        }
        return result;
    }
}

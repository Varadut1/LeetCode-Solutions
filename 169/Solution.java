class Solution {
    public int majorityElement(int[] nums) {
        int count=0;
        int major = -1;
        for(int i = 0; i<nums.length; i++){
            if(count == 0){
                major = nums[i];
                count++;
            }
            else if(major == nums[i]){
                count ++;
            }
            else{
                count--;
            }
        }
        return major;
    }
}

class Solution {
    public int findDuplicate(int[] nums) {
        int slow = nums[0];
        int fast = nums[0];
        if(nums.length>2){
            fast = nums[nums[fast]];
            slow = nums[slow];
        }
        else{
            return nums[0];
        }

        while(fast!=slow){
            slow = nums[slow];
            fast = nums[nums[fast]];
        }
        System.out.println(slow+" "+fast);

        slow = nums[0];
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }

        return fast;
    }
}

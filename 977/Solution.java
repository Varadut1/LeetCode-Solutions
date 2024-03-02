class Solution {
    public int[] sortedSquares(int[] nums) {
        int inserfrombehind = nums.length - 1;
        int leftcounter = 0;
        int rightcounter = nums.length-1;
        int [] result = new int[nums.length];
        while(leftcounter<=rightcounter){
            if(Math.abs(nums[leftcounter])<Math.abs(nums[rightcounter])){
                result[inserfrombehind--] = nums[rightcounter]*nums[rightcounter--];
            }
            else{
                result[inserfrombehind--] = nums[leftcounter]*nums[leftcounter++];
            }
        }
        return result;
    }
}

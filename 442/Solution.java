class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        ArrayList<Integer> result = new ArrayList<>();
        for(int i = 0; i<nums.length; i++){
            int x = Math.abs(nums[i]);
            if(nums[x-1]<0){
                result.add(Math.abs(nums[i]));
            }
            nums[x-1] *= -1;
        }
        return result;
    }
}

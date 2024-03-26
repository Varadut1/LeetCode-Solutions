class Solution {
    public int firstMissingPositive(int[] nums) {
        for(int i = 0; i<nums.length; i++) {
            if(nums[i] < 0){
                nums[i] = 0;
            }
        }
        for(int i = 0; i<nums.length; i++){
            int ref = Math.abs(nums[i]) - 1;
            if(ref>=nums.length || ref<0) continue;
            if(nums[ref] == 0) {
                nums[ref] = Integer.MIN_VALUE +1;
                continue;
            }
            nums[ref] = Math.abs(nums[ref])*-1;
        }

        for(int i = 0; i<nums.length; i++){
            if(nums[i]>=0) return i+1;
        }
        return nums.length+1;
    }
}

// class Solution {
//     public int firstMissingPositive(int[] nums) {
//         for (int i = 0; i < nums.length; i++) {
//             if (nums[i] <= 0) {
//                 nums[i] = nums.length + 1; 
//             }
//         } 
//         for (int i = 0; i < nums.length; i++) {
//             int index = Math.abs(nums[i]) - 1;
//             if (index < nums.length) {
//                 nums[index] = -Math.abs(nums[index]);
//             }
//         }
//         for (int i = 0; i < nums.length; i++) {
//             if (nums[i] > 0) {
//                 return i + 1; 
//             }
//         }
//         return nums.length + 1;
//     }
// }

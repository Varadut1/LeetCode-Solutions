class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        //Sol1:
        HashSet<Integer> map = new HashSet<>();
        for(int i: nums1){
            map.add(i);
        }
        HashSet<Integer> set = new HashSet<>();
        for(int i: nums2){
            if(map.contains(i))  set.add(i);
        }
        return set.stream().mapToInt(Integer::intValue).toArray();

        //Sol2:
        // Arrays.sort(nums1);
        // Arrays.sort(nums2);
        // int i=0, j=0;
        // HashSet<Integer> set = new HashSet<>();
        // while(i<nums1.length && j<nums2.length){
        //     if(nums1[i]==nums2[j]) {
        //         set.add(nums1[i]); i++; j++;
        //     }
        //     else if(nums1[i]<nums2[j]){
        //         i++;
        //     }
        //     else if(nums1[i]>nums2[j]){
        //         j++;
        //     }
        // }
        // return set.stream().mapToInt(Integer::intValue).toArray();
    }
}

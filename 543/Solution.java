class Solution {
    int maxD = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        travel(root);
        return maxD;
    }
    public int travel(TreeNode root){
        if(root != null){
            int left = travel(root.left);
            int right = travel(root.right);
            int curr = left+right;
            maxD = Math.max(maxD, curr);
            return 1+Math.max(left, right);
        }
        else{
            return 0;
        }
    }
}

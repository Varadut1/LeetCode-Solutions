class Solution {
    int maxrecursed = 0;
    TreeNode element = null;
    public int findBottomLeftValue(TreeNode root) {
        if(root.left == null && root.right==null){
            return root.val;
        }
        travel(root,maxrecursed);
        return element.val;
    }
    void travel(TreeNode root, int recursed){
        if(root == null){
            return;
        }
        if (recursed > maxrecursed) {
            maxrecursed = recursed;
            element = root;
        }

        travel(root.left, recursed + 1);
        travel(root.right, recursed + 1);
    }
}

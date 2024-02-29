class Solution {
    public boolean isEvenOddTree(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        if(root.val % 2 != 1){
            return false;
        }
        else{
            queue.add(root);
        }
        int level = 0;
        while(!queue.isEmpty()){
            int size = queue.size();
            int order = (level % 2 == 0) ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            for (int i = 0; i < size; i++) {
                TreeNode vertex = queue.poll();
                if((vertex.val%2 == 1 && vertex.val > order && level%2 == 0) || (vertex.val%2 == 0 && vertex.val < order && level%2 == 1)){
                    order = vertex.val;
                    if(vertex.left!=null) queue.add(vertex.left);
                    if(vertex.right!=null) queue.add(vertex.right);
                }
                else{
                    return false;
                }
                order = vertex.val;
            }
            level++;
        }
        return true;
    }
}

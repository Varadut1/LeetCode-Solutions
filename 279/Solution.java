class Solution {
    public int numSquares(int n) {
        int[] memo = new int[n+1];
        Arrays.fill(memo, Integer.MAX_VALUE);
        memo[0] = 0;
        
        for(int i=1;i<=n;i++) {
            for(int j=1;j*j<=i;j++) {
                memo[i] = Math.min(memo[i], 1 + memo[i-(j*j)]);
            }
        }

        return memo[n];
    }
}

//search with nearest perfect square 
// [1, 4, 9, ]

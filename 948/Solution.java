class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        Arrays.sort(tokens);
        int p1 = 0;
        int p2 = tokens.length-1;
        int score = 0;
        while(p1<=p2){
            if((p2-p1==0) && (power<tokens[p1])){
                return score;
            }
            if(power>=tokens[p1]){
                power -= tokens[p1++];
                score++;
            }
            else if (power<tokens[p1]){
                power+=tokens[p2];
                score--;
                p2--;
            }
            if(score < 0){ 
                return 0;
            }
        }
        return score;
    }
}

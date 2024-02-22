class Solution {
    public int findJudge(int n, int[][] trust) {
        boolean[] mytrust = new boolean[n+1];
        int judge = -1;
        for(int i = 0; i<trust.length; i++){
            mytrust[trust[i][0]] = true;
        }
        for(int i=1; i<n+1; i++){
            if(!mytrust[i]){
                judge = i;
            }
        }
        if(judge == -1){
            return judge;
        }
        else{
            for(int i = 0; i<trust.length; i++){
                mytrust[trust[i][0]] = false;
            }
            for(int i = 0; i<trust.length; i++){
                if(trust[i][1] == judge){
                    mytrust[trust[i][0]] = true;
                }
            }
            for(int i = 1; i<n+1; i++){
                if(!mytrust[i] && i!=judge){
                    return -1;
                }
            }
            return judge;
        }
    }
}

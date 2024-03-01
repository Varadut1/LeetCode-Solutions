class Solution {
    public String maximumOddBinaryNumber(String s) {
        int onecount = 0;
        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i) == '1') onecount++;
        }
        StringBuilder news = new StringBuilder();
        for(int i = 0; i<s.length()-1; i++){
            if(onecount>1){
                news.append('1');
                onecount--;
            }
            else{
                news.append('0');
            }
        }
        news.append('1');
        return news.toString();
    }
}

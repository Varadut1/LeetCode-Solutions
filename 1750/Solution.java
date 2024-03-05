class Solution {
    public int minimumLength(String s) {
        StringBuilder sb = new StringBuilder(s);
        int left = 0, right = sb.length()-1;
        while(left<right && sb.length()>1){
            char newchar;
            if(sb.charAt(left)==sb.charAt(right)){
                newchar=sb.charAt(left);
            }
            else{
                break;
            }
            int start = -1;
            int end = 0;
            for(int i = 0; i<sb.length(); i++){
                if(sb.charAt(i) == newchar && i!=sb.length()-1){
                    start++;
                }
                else{
                    break;
                }
            }
            for(int i = sb.length()-1; i>=0; i--){
                if(sb.charAt(i) == newchar && i!=start){
                    end++;
                }
                else{
                    break;
                }
            }
            for (int i = 0; i <= start; i++) {
                sb.deleteCharAt(0);
            }
            for (int i = 0; i < end; i++) {
                sb.deleteCharAt(sb.length() - 1);
            }
            left = 0;
            right = sb.length() - 1;
        }
        return sb.length();
    }
}

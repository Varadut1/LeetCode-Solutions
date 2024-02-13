class Solution {
    public String firstPalindrome(String[] words) {

        for( int i = 0; i<words.length; i++ ){
            if(isPalindrome(words[i])){
                return words[i];
            }
        }
        return "";
        
    }
    boolean isPalindrome(String a){
        for(int i = 0, j=a.length()-1; i<(a.length()/2); i++, j--){
            if(a.charAt(i)!=a.charAt(j)){
                return false;
            }
        }
        return true;
    }
}

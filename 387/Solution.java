import java.util.*;

public class Solution {
    public int firstUniqChar(String s) {
        HashMap<String, Integer> map = new HashMap<>();
        for(int i = 0; i<s.length(); i++){
            int currentValue = map.getOrDefault(s.charAt(i)+"", 0);
            map.put(s.charAt(i)+"",currentValue+1);
        }
        for(int i=0; i<s.length(); i++){
            if(map.get(s.charAt(i)+"")==1){
                return i;
            }
        }
        return -1;
    }
}
import java.util.HashMap;
import java.util.Map;

class LongestPlindrome {
    public int longestPalindrome(String s) {
        Map<Character, Integer> hm = new HashMap<>();
        char[] ch = s.toCharArray();
        for(Character c:ch){
            if(hm.containsKey(c)){
                int temp = hm.get(c);
                temp++;
                hm.put(c, temp);
            }else{
                hm.put(c, 1);
            }
        }

        int k = 0;
        int od = 0;
        for(Integer x: hm.values()){
            k = k+x;
            if(x%2==1) od++;
        }
        if(od>0){
            k = k-od+1;
        }
        return k;

    }
}
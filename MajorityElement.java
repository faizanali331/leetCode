import java.util.HashMap;
import java.util.Map;

class MajorityElement{
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> hm = new HashMap<>();
        for(Integer x:nums){
            if(hm.containsKey(x)){
                int temp = hm.get(x);
                temp++;
                hm.put(x, temp);
            }else{
                hm.put(x, 1);
            }
        }
        int max = 0;
        for(Integer val: hm.values()){
            if(max<val)
                max = val;
        }
        int key = 0;
        for(Integer k : hm.keySet()){
            if(hm.get(k)==max){
                key = k;
                break;
            }
        }
        return key;
    }
}
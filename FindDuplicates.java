import java.util.HashSet;
import java.util.Set;

class FindDuplicates {
    public boolean containsDuplicate(int[] nums) {
       /* Map<Integer, Integer> hm = new HashMap<>();
        for(Integer x: nums){
            if(hm.containsKey(x)){
                int temp = hm.get(x);
                temp++;
                hm.put(x, temp);
            }else{
                hm.put(x, 1);
            }
        }
        for(Integer x:hm.values()){
            if(x>=2) return true;
        }
        return false;*/

        Set<Integer> set = new HashSet<>();
        for(Integer x: nums){
            if(!set.add(x)){
                return true;
            }
        }
        return false;
    }
}
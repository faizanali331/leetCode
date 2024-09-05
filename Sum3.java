import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Sum3 {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        Arrays.sort(nums);
        for(int i=0; i<nums.length; i++){
            int tar = 0;
            int li = i+1;
            int ri = nums.length-1;
            if(i>0 && nums[i]==nums[i-1]){

                continue;
            }

            while(li<ri){

                int ntar = tar-nums[i];
                if(nums[li]+nums[ri]==ntar){
                    List<Integer> l = new ArrayList<>();
                    l.add(nums[i]);
                    l.add(nums[li]);
                    l.add(nums[ri]);
                    result.add(l);
                    li++;
                    ri--;
                    while(nums[li]==nums[li-1]&&li<ri) li++;
                    while(nums[ri]==nums[ri+1]&&li<ri) ri--;
                }
                else if(nums[li]+nums[ri]<ntar){
                    li++;
                }
                else if(nums[li]+nums[ri]>ntar){
                    ri--;
                }
            }
        }
        return result;
    }
}
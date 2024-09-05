class MaxSumSubArray {
    public int maxSubArray(int[] nums) {
        /*int max = nums[0];
          for(int i=0; i<nums.length; i++){
            int submax = 0;
            for(int j=i; j<nums.length; j++){
              submax = submax+nums[j];
              if(max<submax){
                max = submax;
              }
            }
          }
        return max;*/
        int max = nums[0];
        int submax = 0;
        for(Integer x: nums){
            submax = Math.max(submax+x, x);
            max = Math.max(submax, max);
        }
        return max;
    }
}
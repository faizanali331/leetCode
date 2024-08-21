class SumOfTwoIntegers{
    public int[] twoSum(int[] nums, int target) {
        int []b = {0, 0};
        for(int i=0; i<nums.length-1; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i]+nums[j]==target){
                    int []a = {i, j};
                    return a;
                }

            }
        }

        return b;
    }
}
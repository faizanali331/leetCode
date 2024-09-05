class RemoveDuplicates{
    public int removeDuplicates(int[] nums) {
        int[] sorted = new int[nums.length];
        int k = 1;
        sorted[0] = nums[0];
        int n = nums.length-1;
        for(int i=1; i<nums.length; i++){
            if(sorted[k-1]<nums[i]){
                sorted[k] = nums[i];
                k++;
            }else{
                sorted[n] = nums[i];
                n--;
            }
        }
        for(int i=0; i<sorted.length; i++){
            nums[i] = sorted[i];
        }

        return k;
    }
}
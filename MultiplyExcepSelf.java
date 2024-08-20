class MultiplyExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int product = 1;
        int A[]=new int[nums.length];
        int zero = 1;
        int countZero=0;

        for(int i=0; i<nums.length; i++){
            if(nums[i]!=0)
                product=product*nums[i];
            else{
                zero = nums[i];
                countZero++;
            }
        }

        for(int j=0; j<nums.length; j++){
            if(countZero>=2){
                A[j]=0;
            }else{
                if(nums[j]!=0)
                    A[j]=(product/nums[j])*zero;
                else  A[j]=product;
            }
        }
        return A;

    }
}
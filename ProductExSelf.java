class ProductExSelf {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        result[0] = 1;
        for(int i=1; i<n; i++){
            result[i] = result[i-1]*nums[i-1];
        }
        int rightProduct = 1;
        for(int i=n-1; i>=0; i--){
            result[i] = result[i]*rightProduct;
            rightProduct = rightProduct*nums[i];
        }
        return result;

        /*int product = 1;
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
        return A;*/

    }
}
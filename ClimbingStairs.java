class ClimbingStairs {
    int[] a = new int[n];
    public int climbStairs(int n) {
        /*if(n<=3) return n;
        int pre = 1;
        int pre2 = 2;

        for(int i=3; i<=n; i++){
            int current = pre+pre2;
            pre = pre2;
            pre2 = current;
        }
        return pre2;*/

        return calculate(n);
    }
    public int calculate(int n) {
        if (n <= 3) return n;

    }
}
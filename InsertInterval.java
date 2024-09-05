import java.util.Arrays;
import java.util.Stack;

class InsertInterval {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        if(intervals.length==0) return new int[][]{newInterval};
        if(newInterval[1]<intervals[0][0]){
            int[][] result = new int[intervals.length+1][2];
            result[0]=newInterval;
            for(int i=1; i<result.length; i++){
                result[i] = intervals[i-1];
            }
            return result;
        }

        Stack<int[]> stk = new Stack<>();
        int k=0;
        for(int i=0; i<intervals.length; i++){
            if(intervals[i][1] < newInterval[0]){
                stk.push(intervals[i]);

            }
            else if(newInterval[1]<intervals[i][0]){
                stk.push(newInterval);
                k=i-1;
                break;
            }else{
                newInterval[0] = Math.min(intervals[i][0], newInterval[0]);
                newInterval[1] = Math.max(intervals[i][1], newInterval[1]);
                k=i;
                break;
            }

        }
        if(stk.isEmpty() || !Arrays.equals(stk.peek(), newInterval)){
            stk.push(newInterval);
        }
        k++;
        while(k<intervals.length){
            int[] top = stk.peek();
            if(intervals[k][0]>top[1]){
                stk.push(intervals[k]);
            }else{

                top[1]=Math.max(top[1], intervals[k][1]);
            }
            k++;
        }
        int[][] rt = new int[stk.size()][2];
        for(int j=stk.size()-1; j>=0; j--){
            rt[j] = stk.pop();
        }
        return rt;
    }
}
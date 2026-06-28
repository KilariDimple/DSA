class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        int n=intervals.length;
        int  cnt=0;
        Arrays.sort(intervals,(a,b)->a[1]-b[1]);
        int prev=intervals[0][1];
        for(int i=1;i<n;i++){
            int present=intervals[i][0];
            if(present>=prev) prev=intervals[i][1];
            else cnt++;
        }
        return cnt;
    }
}
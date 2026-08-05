class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        int time = 0;
        for(int i=1;i<points.length;i++){
            int[] curr = points[i];
            int[] prev = points[i-1];
            int dx = Math.abs(curr[0] - prev[0]);
            int dy = Math.abs(curr[1] - prev[1]);
            time += Math.max(dx,dy);
        }
        return time;
    }
}
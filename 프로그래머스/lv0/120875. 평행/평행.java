class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        if (slope(dots[0], dots[1])==slope(dots[2],dots[3])) {
        	answer = 1;
        } else if (slope(dots[0], dots[2])==slope(dots[1],dots[3])) {
        	answer = 1;
        } else if (slope(dots[0], dots[3])==slope(dots[1],dots[2])) {
        	answer = 1;
        }
        return answer;
    }
    
    public double slope(int[] a, int[] b) {
    	return (a[0]-b[0])*1.0/(a[1]-b[1]);
    }
}
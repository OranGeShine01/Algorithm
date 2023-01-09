class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        int w=0; int h=0; // width, height
        if (dots[0][0]==dots[1][0]) {
        	w = Math.abs(dots[0][0]-dots[2][0]);
        } else {
        	w = Math.abs(dots[0][0]-dots[1][0]);
        }
        
        if (dots[0][1]==dots[1][1]) {
        	h = Math.abs(dots[0][1] - dots[2][1]);
        } else {
        	h = Math.abs(dots[0][1] - dots[1][1]);
        }
        answer = w*h;
        
        return answer;
    }
}
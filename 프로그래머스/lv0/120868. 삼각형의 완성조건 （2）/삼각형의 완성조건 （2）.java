class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        if (sides[0]>sides[1]) {
        	int temp = sides[0];
        	sides[0] = sides[1];
        	sides[1] = temp;
        }
        int max = sides[0] + sides[1];
        for (int i=1; i<=sides[1]; i++) {
        	if (sides[0] + i>sides[1]) {
        		answer+=1;
        	}
        }
        for (int i=sides[1]+1; i<max; i++) {
        	 if (i>sides[1] && i<max) {
        		 answer+=1;
        	 }
        }
        return answer;
    }
}
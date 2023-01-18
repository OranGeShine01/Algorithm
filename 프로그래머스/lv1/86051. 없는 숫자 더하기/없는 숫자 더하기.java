class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int l = numbers.length;
        boolean[] bl = new boolean[10];
        for (int i : numbers) {
            bl[i] = true;
        }
        
        for (int i=0; i<10; i++) {
            if (!bl[i]) {
                answer+=i;
            }
        }
        
        return answer;
    }
}
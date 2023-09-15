class Solution {
    public int solution(int n) {
        int answer = n+1;
        String str = Integer.toBinaryString(n);
        int base = 0;
        for (char ch : str.toCharArray()) {
            if (ch=='1') base++; 
        }
        while(true) {
            int count = 0;
            str = Integer.toBinaryString(answer);
            for (char ch : str.toCharArray()) {
                if (ch=='1') count++;
            }
            if (count==base) break;
            answer++;
        }
        return answer;
    }
}
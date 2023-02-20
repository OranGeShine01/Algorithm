class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        for (int i=left; i<=right; i++) {
            if (cd(i)%2==0) {
                answer+=i;
            }
            else {
                answer-=i;
            }
        }
        return answer;
    }

    int cd(int n) {
        int count = 0;
        double root = Math.sqrt(n);
        for (int i=1; i<=root; i++) {
            if (Math.pow(i, 2)==n) {
                count++;
            }
            else if (n%i==0) {
                count+=2;
            }
        }
        return count;
    }
}
class Solution {
    public int solution(int n, int w, int num) {
        int answer = 0;
        int totalH = (n - 1) / w;
        int currH = (num - 1) / w;
        answer = totalH - currH;
        if (totalH % 2 == 0 && getCol(n, w) >= getCol(num, w)) answer++;
        else if (totalH % 2 != 0 && getCol(num, w) >= getCol(n, w)) answer++;
        return answer;
    }
    
    static int getCol(int total, int div) {
        boolean isEven = ((total - 1) / div) % 2 == 0;
        int mod = (total - 1) % div;
        return isEven ? mod : div - mod - 1;
    }
}
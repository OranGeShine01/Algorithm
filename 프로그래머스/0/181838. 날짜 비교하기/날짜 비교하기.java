class Solution {
    public int solution(int[] date1, int[] date2) {
        return calDay(date1) < calDay(date2) ? 1 : 0;
    }
    
    int calDay(int[] date) {
        return date[0] * 13 + date[1] * 32 + date[2];
    }
}
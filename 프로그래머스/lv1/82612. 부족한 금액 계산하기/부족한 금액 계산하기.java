class Solution {
    public long solution(int price, int money, int count) {
        long answer = 0;
        long cost = (long)price * count * (count+1) / 2;
        if (money<cost) {
            answer+=cost-money;
        }

        return answer;
    }
}
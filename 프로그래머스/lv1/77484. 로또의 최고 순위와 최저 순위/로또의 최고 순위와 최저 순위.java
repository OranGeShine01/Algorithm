class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int count = 0; // 맞은 번호의 갯수
        int zero = 0; // 배열에서 0의 갯수
        for (int i : lottos) {
            if (i == 0) {
                zero++;
                continue;
            }
            for (int j : win_nums) {
                if (i == j) count++;
            }
        }

        answer[1] = Math.min(7-count, 6);
        answer[0] = Math.min(7-count-zero,6);
        return answer;
    }
}
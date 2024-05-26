import java.util.*;

class Solution {
    public int solution(int[][] scores) {
        int answer = 1;
        // 완호의 점수
        int[] wanho = scores[0];
        int wanhoSum = wanho[0] + wanho[1];
        int len = scores.length;
        
        // 근무태도 순서로 내림차순 정렬, 같을시 동료 평가 점수로 오름차순 정렬
        Arrays.sort(scores, (o1, o2) -> {
                if (o1[0] == o2[0]) return o1[1] - o2[1];
                return o2[0] - o1[0];
        });
        
        int maxScore = scores[0][1];
        
        for (int i = 1; i < len; i++) {
            // 인센티브 못받는경우
            if (scores[i][1] < maxScore) {
                //완호인경우
                if (Arrays.equals(scores[i], wanho)) return -1;
                scores[i][0] = -1;
                scores[i][1] = -1;
            } else {
                maxScore = scores[i][1];
            }
        }
        
        // 점수합순으로 내림차순 정렬, 인센티브 배제된 사원들은 음수이므로 자연스레 뒤로 밀림.
        Arrays.sort(scores, (o1, o2) -> (o2[1] + o2[0]) - (o1[0] + o1[1]));
        
        for (int[] score : scores) {
            if (score[0] + score[1] > wanhoSum) {
                answer++;
            } else break;
        }
        
        return answer;
    }
}
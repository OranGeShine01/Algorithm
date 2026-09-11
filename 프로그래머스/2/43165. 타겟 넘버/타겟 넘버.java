import java.util.*;

class Solution {
    
    int answer;
    int len;
    
    public int solution(int[] numbers, int target) {
        answer = 0;
        len = numbers.length;
        dfs(numbers, target, 0, 0);
        return answer;
    }
    
    void dfs(int[] numbers, int target, int curr, int depth) {
        if (depth == len) {
            if (target == curr) answer++;
            return;
        }
        dfs(numbers, target, curr + numbers[depth], depth + 1);
        dfs(numbers, target, curr - numbers[depth], depth + 1);
    }
}
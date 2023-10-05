class Solution {
    
    static int answer;
    
    public int solution(int[] numbers, int target) {
        answer = 0;
        dfs(numbers, target, 0, 0, true);
        dfs(numbers, target, 0, 0, false);
        return answer;
    }
    
    public void dfs(int[] numbers, int target, int depth, int sum, boolean sign) {
        if (depth==numbers.length) {
            if (sign && target==sum) answer++;
            return;
        }
        
        if (sign) sum+=numbers[depth];
        else sum-=numbers[depth];
        dfs(numbers, target, depth+1, sum, true);
        dfs(numbers, target, depth+1, sum, false);
    }
}
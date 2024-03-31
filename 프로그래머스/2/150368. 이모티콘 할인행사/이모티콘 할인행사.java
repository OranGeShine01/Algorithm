class Solution {
    
    final int[] sale = {10, 20, 30, 40};
    int[] answer;
    
    public int[] solution(int[][] users, int[] emoticons) {
        answer = new int[]{0, 0};
        int[] emtiSale = new int[emoticons.length];
        dfs(emtiSale, 0, users, emoticons);
        return answer;
    }
    
    void dfs(int[] emtiSale, int depth, int[][] users, int[] emoticons) {
        if (depth == emoticons.length) {
            calcul(emtiSale, users, emoticons);
            return;
        }
        
        for (int i : sale) {
            emtiSale[depth] = i;
            dfs(emtiSale, depth + 1, users, emoticons);
        }
        
    }
    
    void calcul(int[] emtiSale, int[][] users, int[] emoticons) {
        int[] result = {0, 0};
        for (int[] user : users) {
            int cost = 0;
            for (int i=0; i<emoticons.length; i++) {
                if (user[0] <= emtiSale[i]) cost += (100 - emtiSale[i]) * emoticons[i] / 100;
            }
            if (cost >= user[1]) {
                cost = 0;
                result[0]++;
            }
            result[1] += cost;
        }
        
        if (answer[0] < result[0]) answer = result;
        else if (answer[0] == result[0] && answer[1] < result[1]) answer[1] = result[1];
    }
}
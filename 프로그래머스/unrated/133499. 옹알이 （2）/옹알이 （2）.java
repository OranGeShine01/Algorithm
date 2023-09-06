class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] str = {"aya", "ye", "woo", "ma"};
        for (String i : babbling) {
            String temp = i;
            for (String j : str) {
                if (temp.contains(j+j)) continue;
                temp = temp.replace(j, " ");
            }
            if (temp.replace(" ", "").length()==0) answer++;
        }
        return answer;
    }
}
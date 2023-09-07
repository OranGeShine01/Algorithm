class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        int[] dp = new int[26]; // 각 키입력의 최소버튼을 저장하는 배열.

        for (int i=0; i<dp.length; i++) {
            dp[i] = Integer.MAX_VALUE; // 초기화
        }

        for (int i=0; i<keymap.length; i++) {
            int l = keymap[i].length();
            for (int j=0; j<l; j++) {
                char ch = keymap[i].charAt(j);
                dp[ch-'A'] = Math.min(j+1, dp[ch-'A']);
            }
        }

        for (int i=0; i<targets.length; i++) {
            int l = targets[i].length();
            for (int j=0; j<l; j++) {
                char ch = targets[i].charAt(j);
                if (dp[ch-'A']==Integer.MAX_VALUE) {
                    answer[i] = -1;
                    break;
                } else {
                    answer[i] += dp[ch-'A'];
                }
            }
        }

        return answer;
    }
}
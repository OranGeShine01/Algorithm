class Solution {
    
    final int maxTime = 1450;
    final int hour = 60;
    final int clean = 10;
    
    public int solution(String[][] book_time) {
        int answer = 0;
        int time[][] = new int[book_time.length][2];
        int[] sum = new int[maxTime+1];
        int cnt = 0;
        
        for (int i=0; i<time.length; i++) {
            for (int j=0; j<time[0].length; j++) {
                String[] str = book_time[i][j].split(":");
                time[i][j] = Integer.parseInt(str[0]) * hour + Integer.parseInt(str[1]);
                if (j==1) {
                    time[i][j]+=clean;
                    sum[time[i][j]]-=1;
                } else sum[time[i][j]]+=1;
            }
        }
        
        for (int i : sum) {
            cnt+=i;
            answer = Math.max(answer, cnt);
        }
        
        return answer;
    }
}
import java.util.*;

class Solution {
    
    // 셔틀버스 시작 시간
    final int start = 540;
    // 셔틀버스 종료 시간
    final int end = 1439;
    
    public String solution(int n, int t, int m, String[] timetable) {
        // 현재 셔틀버스의 출발시간
        int cnt = start;
        // 정답의 int값
        int answer = 0;
        
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (String s : timetable) {
            pq.add(convertTimeToInt(s));
        }
        
        // 현재 셔틀버스의 탑승수
        int cap = 0;
        
        for (int i = 0; i < n; i++) {
            
            cap = 0;
            while (!pq.isEmpty() && m > cap && cnt >= pq.peek()) {
                int curTime = pq.poll();
                cap++;
                answer = curTime - 1;
            }
            cnt = Math.min(cnt + t, end);
        }
        if (m > cap) answer = cnt - t;
        return convertIntToTime(answer);
    }
    
    private int convertTimeToInt(String t) {
        String[] times = t.split(":");
        return Integer.parseInt(times[0]) * 60 + Integer.parseInt(times[1]);
    }
    
    private String convertIntToTime(int n) {
        int h = n / 60;
        int m = n % 60;
        StringBuilder sb = new StringBuilder();
        if (h < 10) sb.append('0');
        sb.append(h).append(':');
        if (m < 10) sb.append('0');
        return sb.append(m).toString();
    }
}
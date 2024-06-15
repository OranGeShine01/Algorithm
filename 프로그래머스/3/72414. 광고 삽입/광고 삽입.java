class Solution {
    public String solution(String play_time, String adv_time, String[] logs) {
        int playTime = convertTime(play_time);
        int advTime = convertTime(adv_time);
        int maxStart = playTime - advTime;
        int[] times = new int[playTime + 1];
      
        for (String log : logs) {
            String[] logTime = log.split("-");
            int start = convertTime(logTime[0]);
            int end = convertTime(logTime[1]);
            for (int i = start; i < end; i++) {
                times[i]++;
            }
        }
        
        int maxStartTime = 0;
        long totalTime = 0;
        for (int i = 0; i < advTime; i++) {
            totalTime += times[i];
        }
        
        long maxTotalTime = totalTime;
        for (int i = advTime; i < playTime; i++) {
            totalTime += times[i] - times[i - advTime];
            if (totalTime > maxTotalTime) {
                maxTotalTime = totalTime;
                maxStartTime = i - advTime + 1;
            }
        }
        
        return convertString(maxStartTime);
    }
    
    private int convertTime(String time) {
        String[] times = time.split(":");
        int hour = Integer.parseInt(times[0]);
        int min = Integer.parseInt(times[1]);
        int sec = Integer.parseInt(times[2]);
        return (hour * 60 + min) * 60 + sec;
    }
    
    private String convertString(int time) {
        int hour = time / 3600;
        time %= 3600;
        int min = time / 60;
        time %= 60;
        int sec = time;
        return String.format("%02d:%02d:%02d", hour, min, sec);
    }
}
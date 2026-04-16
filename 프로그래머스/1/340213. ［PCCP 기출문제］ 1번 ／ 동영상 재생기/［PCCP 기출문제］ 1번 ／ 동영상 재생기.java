import java.util.*;

class Solution {
    
    static int ops;
    static int ope;
    
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        String answer = "";
        int totalLen = convertStringTime(video_len);
        ops = convertStringTime(op_start);
        ope = convertStringTime(op_end);
        int initTime = convertStringTime(pos);
        
        int ans = skippingOpening(initTime);
        
        for (String s : commands) {
            if (s.equals("next")) {
                ans = skippingOpening(Math.min(ans + 10, totalLen));
            } else {
                ans = skippingOpening(Math.max(ans - 10, 0));
            }
        }
        
        StringBuilder sb = new StringBuilder();
        sb.append(digitNum(ans / 60)).append(':').append(digitNum(ans % 60));
        answer = sb.toString();
        return answer;
    }
    
    static int convertStringTime(String time) {
        String[] arr = time.split(":");
        return Integer.parseInt(arr[0]) * 60 + Integer.parseInt(arr[1]);
    }
    
    static String digitNum(int i) {
        return i <= 10 ? "0" + i : String.valueOf(i);
    }
    
    static int skippingOpening(int i) {
        return (i >= ops && i <= ope) ? ope : i;
    }
}
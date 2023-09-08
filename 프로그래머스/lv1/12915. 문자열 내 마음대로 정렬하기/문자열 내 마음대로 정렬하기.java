import java.util.Arrays;

class Solution {
    public String[] solution(String[] strings, int n) {
        int l = strings.length;
        String[] answer = new String[l];
        String[] arr = new String[l];
        for (int i=0; i<l; i++) {
            StringBuilder sb = new StringBuilder();
            arr[i] = sb.append(strings[i].charAt(n)).append(strings[i]).toString();
        }
        Arrays.sort(arr);
        for (int i=0; i<l; i++) {
            answer[i] = arr[i].substring(1);
        }
        return answer;
    }
}
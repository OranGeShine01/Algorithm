import java.util.*;

class Solution {
    public String solution(String s) {
        int l = s.length();
        StringTokenizer st = new StringTokenizer(s);
        ArrayList<Integer> arr = new ArrayList<>();
        while (st.hasMoreTokens()) {
            arr.add(Integer.parseInt(st.nextToken()));
        }
        Collections.sort(arr);
        StringBuilder sb = new StringBuilder();
        sb.append(arr.get(0)).append(" ").append(arr.get(arr.size()-1));
        return sb.toString();
    }
}
import java.util.*;

class Solution {
    public int solution(String dirs) {
        int[] xy = {0, 0};
        Set<String> set = new HashSet<>();
        char[] arr = dirs.toCharArray();
        for (char ch : arr) {
            StringBuilder sb = new StringBuilder();
            switch (ch) {                    
                case 'U' :
                    if (xy[1]<5) {
                        sb.setLength(0);
                        sb.append(xy[0]).append(xy[1]).append(xy[0]).append(xy[1]+1);
                        set.add(sb.toString());
                        xy[1]++;
                    }
                    break;
                case 'D' :
                    if (xy[1]>-5) {
                        sb.setLength(0);
                        sb.append(xy[0]).append(xy[1]-1).append(xy[0]).append(xy[1]);
                        set.add(sb.toString());
                        xy[1]--;
                    }
                    break;
                case 'R' :
                    if (xy[0]<5) {
                        sb.setLength(0);
                        sb.append(xy[0]).append(xy[1]).append(xy[0]+1).append(xy[1]);
                        set.add(sb.toString());
                        xy[0]++;
                    }
                    break;
                case 'L' :
                    if (xy[0]>-5) {
                        sb.setLength(0);
                        sb.append(xy[0]-1).append(xy[1]).append(xy[0]).append(xy[1]);
                        set.add(sb.toString());
                        xy[0]--;                        
                    }
                    break;
            }
        }
        
        return set.size();
    }
    
    
}
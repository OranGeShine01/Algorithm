import java.util.*;

class Solution {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;
        if (cacheSize==0) answer=5*cities.length;
        else {
            Queue<String> queue = new LinkedList<>();
            for (String i : cities) {
                String str = i.toUpperCase();
                if (queue.remove(str)) {
                    answer+=1;
                    queue.add(str);
                } else {
                    answer+=5;
                    if (queue.size()>=cacheSize) queue.poll();
                    queue.add(str);
                }
            }
        }        

        return answer;
    }
}
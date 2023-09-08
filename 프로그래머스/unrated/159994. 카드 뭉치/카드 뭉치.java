import java.util.*;

class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        Queue<String> c1 = new LinkedList<>();
        Queue<String> c2 = new LinkedList<>();
        for (String i : cards1) {
            c1.add(i);
        }

        for (String i : cards2) {
            c2.add(i);
        }

        for (int i=0; i<goal.length; i++) {
            if (!c1.isEmpty() && c1.peek().equals(goal[i])) {
                c1.poll();
                continue;
            }
            if (!c2.isEmpty() && c2.peek().equals(goal[i])) {
                c2.poll();
                continue;
            }
            return "No";
        }
        return "Yes";
    }
}
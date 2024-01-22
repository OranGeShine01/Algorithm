import java.util.*;

class Solution {

    static Queue<String> queue;
    static char[] ch = {'A', 'E', 'I', 'O', 'U'};

    public int solution(String word) {
        queue = new LinkedList<>();
        for (int i=1; i<=ch.length; i++) {
            dfs(new StringBuilder(), i);
        }

        String[] str = new String[queue.size()];
        for (int i=0; i<str.length; i++) {
            str[i] = queue.poll();
        }

        Arrays.sort(str);
        Map<String, Integer> map = new HashMap<>();
        for (int i=0; i<str.length; i++) {
            map.put(str[i], i+1);
        }

        return map.get(word);
    }

    public void dfs(StringBuilder sb, int n) {
        int l = sb.length();

        if (l==n) {
            queue.add(sb.toString());
            return;
        }

        for (int i=0; i<ch.length; i++) {
            sb.append(ch[i]);
            dfs(sb, n);
            sb.setLength(l);
        }
    }
}
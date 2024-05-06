import java.util.*;

class Solution {
    
    ArrayList<String> routeList;
    int visited; // 비트마스킹으로 방문여부체크
    final String starting = "ICN";
    
    public String[] solution(String[][] tickets) {
        String[] answer = {};
        routeList = new ArrayList<>();
        visited = 0;
        
        dfs(starting, starting, tickets, 0);
        Collections.sort(routeList);        
        
        return routeList.get(0).split(" ");
    }
    
    void dfs(String start, String route, String[][] tickets, int cnt) {
        if (cnt == tickets.length) {
            routeList.add(route);
            return;
        }
        
        for (int i = 0; i < tickets.length; i++) {
            if (start.equals(tickets[i][0]) && (visited & (1 << i)) == 0) {
                visited |= (1 << i);
                dfs(tickets[i][1], route + " " + tickets[i][1], tickets, cnt + 1);
                visited &= ~(1 << i);
            }
        }
    }
}
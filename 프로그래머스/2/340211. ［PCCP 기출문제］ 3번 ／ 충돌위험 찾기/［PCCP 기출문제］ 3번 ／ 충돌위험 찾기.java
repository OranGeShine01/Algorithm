import java.util.*;

class Solution {
    
    static int maxTurn;
    
    static class Point {
        int r;
        int c;
        Point(int r, int c) {
            this.r = r;
            this.c = c;
        }
    }
    
    public int solution(int[][] points, int[][] routes) {
        int answer = 0;
        maxTurn = 0;
        
        int n = points.length;
        int x = routes.length;
        List<List<Point>> list = new ArrayList<>();
        
        for (int i = 0; i < x; i++) {
            List<Point> timeLine = new ArrayList<>();
            for (int j = 0; j < routes[i].length - 1; j++) {
                int startPoint = routes[i][j] - 1;
            int endPoint = routes[i][j + 1] - 1;
            List<Point> segment = calculRobotRoutes(points[startPoint], points[endPoint]);
            if (j > 0) segment.remove(0);
            timeLine.addAll(segment);
            }
            list.add(timeLine);
        }
        
        for (List<Point> l : list) {
            maxTurn = Math.max(maxTurn, l.size());
        }
        
        for (int i = 0; i < maxTurn; i++) {
            int[][] counts = new int[101][101];
            for (List<Point> l : list) {
                if (l.size() > i) {
                    counts[l.get(i).r][l.get(i).c]++;
                }
            }
            for (int j = 1; j <= 100; j++) {
                for (int k = 1; k <= 100; k++) {
                    if (counts[j][k] >= 2) {
                        answer++;
                    }
                }
            }
        }
        
        return answer;
    }
    
    static List<Point> calculRobotRoutes(int[] start, int[] end) {
        List<Point> result = new ArrayList<>();
        int currR = start[0];
        int currC = start[1];
        
        result.add(new Point(currR, currC));
        
        while (end[0] != currR) {
            currR += end[0] - currR > 0 ? 1 : -1;
            result.add(new Point(currR, currC));
        }
        
        while (end[1] != currC) {
            currC += end[1] - currC > 0 ? 1 : -1;
            result.add(new Point(currR, currC));
        }
        
        return result;
    }
}
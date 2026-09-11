import java.util.*;

class Solution {
    public int[] solution(String[] park, String[] routes) {
        int lenX = park.length;
        int lenY = park[0].length();
        
        int currX = 0;
        int currY = 0;
        
        for (int i = 0; i < lenX; i++) {
            for (int j = 0; j < lenY; j++) {
                char ch = park[i].charAt(j);
                if (ch =='S') {
                    currX = i;
                    currY = j;
                }
            }
        }
        
        for (String route : routes) {
            String[] arr = route.split(" ");
            int dist = Integer.parseInt(arr[1]);
            char dir = arr[0].charAt(0);
            if (dir == 'S' && currX + dist < lenX) {
                boolean moveFlag = true;
                for (int i = currX + 1; i <= currX + dist; i++) {
                    if (park[i].charAt(currY) == 'X') {
                        moveFlag = false;
                        break;
                    }
                }
                if (moveFlag) currX += dist;
            } else if (dir == 'N' && currX - dist >= 0) {
                boolean moveFlag = true;
                for (int i = currX - 1; i >= currX - dist; i--) {
                    if (park[i].charAt(currY) == 'X') {
                        moveFlag = false;
                        break;
                    }
                }
                if (moveFlag) currX -= dist;
            } else if (dir == 'E' && currY + dist < lenY) {
                boolean moveFlag = true;
                for (int i = currY + 1; i <= currY + dist; i++) {
                    if (park[currX].charAt(i) == 'X') {
                        moveFlag = false;
                        break;
                    }
                }
                if (moveFlag) currY += dist;
            } else if (dir == 'W' && currY - dist >= 0) {
                boolean moveFlag = true;
                for (int i = currY - 1; i >= currY - dist; i--) {
                    if (park[currX].charAt(i) == 'X') {
                        moveFlag = false;
                        break;
                    }
                }
                if (moveFlag) currY -= dist;
            }
        }        
        
        return new int[]{currX, currY};
    }
}
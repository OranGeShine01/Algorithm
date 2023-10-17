import java.util.*;

class Solution {
    public int[] solution(String[] park, String[] routes) {
        int[] answer = new int[2];
        int h = park.length;
        int w = park[0].length();
        
        for (int i=0; i<h; i++) {
            int idx = park[i].indexOf('S');
            if (idx!=-1) {
                answer[0] = i;
                answer[1] = idx;
                break;
            }
        }
        
        for (int i=0; i<routes.length; i++) {
            StringTokenizer st = new StringTokenizer(routes[i]);
            char dir = st.nextToken().charAt(0);
            int num = Integer.parseInt(st.nextToken());
        
            if (dir=='E') {
                if (answer[1]+num<w && 
                    park[answer[0]].substring(answer[1], answer[1]+num+1).indexOf('X')==-1) {
                    answer[1]+=num;
                }
            } else if (dir=='W') {
                if (answer[1]-num>=0 && 
                    park[answer[0]].substring(answer[1]-num, answer[1]).indexOf('X')==-1) {
                    answer[1]-=num;
                }
            } else if (dir=='N') {
                boolean pass = true;
                if (answer[0]-num>=0) {
                    for (int j=1; j<=num; j++) {
                        if (park[answer[0]-j].charAt(answer[1])=='X') {
                            pass = false;
                            break;
                        }
                    }
                    if (pass) answer[0]-=num;
                }                
            } else if (dir=='S') {
                boolean pass = true;
                if (answer[0]+num<h) {
                    for (int j=1; j<=num; j++) {
                        if (park[answer[0]+j].charAt(answer[1])=='X') {
                            pass = false;
                            break;
                        }
                    }
                    if (pass) answer[0]+=num;
                }
            }
        }
        
        return answer;
    }
}
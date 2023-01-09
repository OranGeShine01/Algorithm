class Solution {
    public int[] solution(String[] keyinput, int[] board) {

        int xMax = (board[0]-1)/2;
        int yMax = (board[1]-1)/2;
        int x = 0;
        int y = 0;
        
        for (int i=0; i<keyinput.length; i++) {
        	if (keyinput[i].equals("left") && x>xMax*-1) {
        		x-=1;
        	} else if (keyinput[i].equals("right") && x<xMax) {
        		x+=1;
        	} else if (keyinput[i].equals("up") && y<yMax) {
        		y+=1;
        	} else if (keyinput[i].equals("down") && y>yMax*-1) {
        		y-=1;
        	}
        }
        
        if (x>xMax) {
        	x=xMax;
        } else if (x<xMax*-1) {
        	x=xMax*-1;
        }
        
        if (y>yMax) {
        	y=yMax;
        }else if (y<yMax*-1) {
        	y=yMax*-1;
        }
        int[] answer = {x, y};     
        return answer;
    }
}
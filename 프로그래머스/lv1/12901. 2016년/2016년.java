class Solution {
    public String solution(int a, int b) {
        String answer = "";
        while (a!=0) {
            if (a==3) {
                b+=29;
            }
            else if (a==2 || a==4 || a==6 || a==8 || a==9 || a==11) {
                b+=31;
            }
            else if (a==5 || a==7 || a==10 || a==12) {
                b+=30;
            }
            a--;
        }
        switch (b%7) {
            case 1 :
                answer = "FRI";
                break;
                
            case 2 :
                answer = "SAT";
                break;
            case 3 :
                answer = "SUN";
                break;
            case 4 :
                answer = "MON";
                break;
            case 5 :
                answer = "TUE";
                break;
            case 6 :
                answer = "WED";
                break;
            case 0 :
                answer = "THU";
                break;
        }
        return answer;
    }
}
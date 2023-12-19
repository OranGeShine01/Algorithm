class Solution {
    public int solution(int n, String control) {
        char[] arr = control.toCharArray();
        for (char ch : arr) {
            switch (ch) {
                case 'w' :
                    n++;
                    break;
                case 's' :
                    n--;
                    break;
                case 'd' :
                    n+=10;
                    break;
                case 'a' :
                    n-=10;
                    break;
            }
        }
        return n;
    }
}
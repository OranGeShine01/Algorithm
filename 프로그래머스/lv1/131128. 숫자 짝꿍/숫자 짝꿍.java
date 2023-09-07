class Solution {
    public String solution(String X, String Y) {
        String answer = "";
        int[] numX = new int[10]; // x의 각 숫자별 카운트
        int[] numY = new int[10]; // y의 각 숫자별 카운트
        int[] pair = new int[10]; // 짝궁 숫자의 모음

        int lx = X.length();
        int ly = Y.length();

        for (int i=0; i<lx; i++) {
            numX[Character.getNumericValue(X.charAt(i))]++;
        }

        for (int i=0; i<ly; i++) {
            numY[Character.getNumericValue(Y.charAt(i))]++;
        }

        int sum = 0;
        for (int i=0; i<pair.length; i++) {
            pair[i] = Math.min(numX[i], numY[i]);
            sum+=pair[i];
        }
        if (sum==pair[0]) {
            if (pair[0]==0) return "-1";
            else return "0";
        }

        StringBuilder sb = new StringBuilder();
        for (int i=pair.length-1; i>=0; i--) {
            while (pair[i]!=0) {
                sb.append(i);
                pair[i]--;
            }
        }

        answer = sb.toString();

        return answer;
    }
}
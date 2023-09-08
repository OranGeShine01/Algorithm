class Solution {
    public String solution(String[] survey, int[] choices) {
        int[] arr = new int[4]; // 각 성격유형 점수를 저장할 array
        // 0 RT, 1 CF, 2 JM, 3 AN
        char[][] ch = new char[2][4];
        ch[0][0] = 'R';
        ch[1][0] = 'T';
        ch[0][1] = 'C';
        ch[1][1] = 'F';
        ch[0][2] = 'J';
        ch[1][2] = 'M';
        ch[0][3] = 'A';
        ch[1][3] = 'N';


        for (int i=0; i<survey.length; i++) {
            char type = survey[i].charAt(0);
            switch (type) {
                case 'R' :
                    arr[0]+=(4-choices[i]);
                    break;
                case 'T' :
                    arr[0]+=(choices[i]-4);
                    break;
                case 'C' :
                    arr[1]+=(4-choices[i]);
                    break;
                case 'F' :
                    arr[1]+=(choices[i]-4);
                    break;
                case 'J' :
                    arr[2]+=(4-choices[i]);
                    break;
                case 'M' :
                    arr[2]+=(choices[i]-4);
                    break;
                case 'A' :
                    arr[3]+=(4-choices[i]);
                    break;
                case 'N' :
                    arr[3]+=(choices[i]-4);
                    break;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i=0; i<arr.length; i++) {
            if (arr[i]>=0) {
                sb.append(ch[0][i]);
            } else sb.append(ch[1][i]);
        }

        return sb.toString();
    }
}
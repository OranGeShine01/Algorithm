class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        StringBuilder[] sb1 = trans(n, arr1);
        StringBuilder[] sb2 = trans(n, arr2);
        for (int i=0; i<n; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j=0; j<n; j++) {
                if (sb1[i].charAt(j)=='0' && sb2[i].charAt(j)=='0') {
                    sb.append(' ');
                }
                else {
                    sb.append('#');
                }
            }
            answer[i] = sb.toString();
        }

        return answer;
    }

    // 숫자를 이진수로 변환
    static StringBuilder[] trans(int n, int[] arr) {
        StringBuilder[] sb = new StringBuilder[n];
        for (int i=0; i<n; i++) {
            sb[i] = new StringBuilder();
            while (arr[i]!=0) {
                if (arr[i]%2==0) {
                    sb[i].append('0');
                }
                else {
                    sb[i].append('1');
                }
                arr[i]/=2;
            }
            while (sb[i].length()!=n) {
                sb[i].append('0');
            }
            sb[i].reverse();
        }
        return sb;
    }
}
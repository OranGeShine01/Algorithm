class Solution {
    public String solution(int n) {
        int m = n;
        char[] arr = {'4', '1', '2'};
        StringBuilder sb = new StringBuilder();
        while (m>0) {
            int mod = m%3;
            sb.append(arr[mod]);
            m/=3;
            if (mod==0) m--;
        }
        return sb.reverse().toString();
    }
}
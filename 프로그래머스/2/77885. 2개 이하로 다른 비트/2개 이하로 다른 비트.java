class Solution {
    public long[] solution(long[] numbers) {
        long[] answer = new long[numbers.length];
        for (int i=0; i<numbers.length; i++) {
            if (numbers[i]%2==0 || numbers[i]<=1) {
                answer[i] = numbers[i]+1;
                continue;
            } else {
                String bit = Long.toBinaryString(numbers[i]);
                int l = bit.length();
                if (!bit.contains("0")) {
                    answer[i] = Long.parseLong("10"+Long.toBinaryString(numbers[i]>>1), 2);
                } else {
                    StringBuilder sb = new StringBuilder(bit).reverse();
                    int idx = sb.indexOf("0");
                    sb.setCharAt(idx, '1');
                    sb.setCharAt(idx-1, '0');
                    answer[i] = Long.parseLong(sb.reverse().toString(), 2);
                }
            }
        }
        return answer;
    }
}
import java.math.BigInteger;

class Solution {
    public int solution(int balls, int share) {
        int answer = 0;
        BigInteger bi = permutation(balls, share).divide(permutation(share, share));

        answer = bi.intValue();        		
        return answer;
    }
    
    public BigInteger permutation(int n, int r) {
        BigInteger p = new BigInteger("1");
        for (int i=n; i>=n-r+1; i--) {
            p = p.multiply(BigInteger.valueOf(i));
        }
        return p;
    }
}

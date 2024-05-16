import java.math.*;

class Solution {
    public String solution(String a, String b) {
        BigInteger bi = new BigInteger(a);        
        return bi.add(new BigInteger(b)).toString();
    }
}
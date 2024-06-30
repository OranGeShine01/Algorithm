class Solution {
    
    final int bitUnit = 5;
    
    public int solution(int n, long l, long r) {
        return countOne(n, l - 1, r - 1);
    }

    private int countOne(int n, long l, long r) {
        if(n == 0) return 1;
        
        int count = 0;
        long prevLen = (long) Math.pow(bitUnit, n - 1);
        
        for(int i = 0 ; i < bitUnit ; i++) {
            long start = i * prevLen;
            long end = start + prevLen - 1;
            
            if(i == 2 || r < start || end < l) continue;
            
            long newL = Math.max(l, start) - start;
            long newR = Math.min(r, end) - start;
            count += countOne(n - 1, newL, newR);
        }
        return count;            
    }
}
class Solution {
    public boolean solution(int[][] key, int[][] lock) {
        boolean answer = false;
        int kl = key.length;
        int ll = lock.length;
        
        int[][] newLock = new int[kl * 2 + ll - 2][kl * 2 + ll - 2];
        
        for (int i = 0; i < ll; i++) {
            for (int j = 0; j < ll; j++) {
                newLock[i + kl - 1][j + kl - 1] = lock[i][j];
            }
        }
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < kl + ll - 1; j++) {
                for (int k = 0; k < kl + ll - 1; k++) {
                    if (check(key, newLock, j, k, ll)) return true;
                }
            }    
            if (i < 3) key = rotate(key);
        }
        
        return false;
    }
    
    private int[][] rotate(int[][] key) {
        int len = key.length;
        int[][] result = new int[len][len];
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                result[j][len - 1 - i] = key[i][j];
            }
        }
        return result;
    }
    
    private boolean check(int[][] key, int[][] newLock, int x, int y, int ll) {
        int kl = key.length;
        int len = newLock.length;
        
        int[][] tempLock = new int[len][len];
        
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                tempLock[i][j] = newLock[i][j];
            }
        }
        
        for (int i = 0; i < kl; i++) {
            for (int j = 0; j < kl; j++) {
                tempLock[i + x][j + y] += key[i][j];
            }
        }
        
        for (int i = kl - 1; i < kl + ll - 1; i++) {
            for (int j = kl - 1; j < kl + ll - 1; j++) {
                if (tempLock[i][j] != 1) return false;
            }
        }
        return true;
    }
}
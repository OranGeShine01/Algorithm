class Solution {
    public int[] solution(long[] numbers) {
        int[] answer = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            long number = numbers[i];
            String bin = Long.toBinaryString(number);
            String fullBin = completeBinaryTree(bin);
            answer[i] = checkSubTree(fullBin, 0, fullBin.length() - 1) ? 1 : 0;
        }
        return answer;
    }
    
    private String completeBinaryTree(String bin) {
        int fullLength = 1;
        int len = bin.length();
        while (fullLength < len) {
            fullLength = fullLength * 2 + 1;
        }
        int zeroRepeat = Math.max(0, fullLength - len);
        return "0".repeat(zeroRepeat) + bin;
    }
    
    private boolean checkSubTree(String fullBin, int start, int end) {
        if (start > end) return true;
        int mid = (start + end) / 2;
        char ch = fullBin.charAt(mid);
        if (ch == '0') {
            for (int i = start; i <= end; i++) {
                if (fullBin.charAt(i) == '1') return false;
            }
        }
        
        return checkSubTree(fullBin, start, mid - 1) && checkSubTree(fullBin, mid + 1, end);
    }
    
}
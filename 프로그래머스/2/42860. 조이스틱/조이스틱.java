class Solution {
    
    final int alphabetCount = 26;
    
    public int solution(String name) {
        int answer = 0;
        // 문자 A의 수 카운트
        int cnt = 0;
        int len = name.length();
        // 이동에 사용한 스틱 수 카운트
        int move = len - 1;
        
        for (int i=0; i<len; i++) {
            char ch = name.charAt(i);
            int alpbCnt = ch - 'A';
            answer += Math.min(alpbCnt, alphabetCount - alpbCnt);
            if (i < len - 1 && name.charAt(i+1) == 'A') {
                int idxA = i + 1;
                while (idxA < len && name.charAt(idxA) == 'A') {
                    idxA++;
                }
                int rightIdx = len - idxA;
                move = Math.min(move, i + rightIdx + Math.min(i, rightIdx));
            }
        }
        
        return answer + move;
    }
}
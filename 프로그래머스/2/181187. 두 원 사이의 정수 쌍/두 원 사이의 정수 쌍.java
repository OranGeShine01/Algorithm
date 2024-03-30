class Solution {
    public long solution(int r1, int r2) {
        long answer = 0;
        // 중복계산되는 x, y축 값 미리 계산
        long inline = (r2 - r1 + 1) * 4;
        double r1sq = Math.pow(r1, 2);
        double r2sq = Math.pow(r2, 2);
        
        // 1사분면 x값 기준으로 반복문
        for (int i=0; i<=r2; i++) {
            double xsq = Math.pow(i, 2);
            double y1 = i>r1 ? 0 : Math.ceil(Math.sqrt(r1sq - xsq));
            double y2 = Math.floor(Math.sqrt(r2sq - xsq));
            answer += (y2 - y1 + 1) * 4;
        }
        
        return answer - inline;
    }
}
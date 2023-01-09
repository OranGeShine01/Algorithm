class Solution {
    public int solution(int[] common) {
        int gap1 = common[1]-common[0];
        int gap2 = common[2]-common[1];
        double ratio1 = common[1]*1.0/common[0];
        double ratio2 = common[2]*1.0/common[1];
        int l = common.length;
        int answer=0;
        if (gap1==gap2) {
            answer = common[l-1]+gap1;
        } else {
            answer = common[l-1]*(int)ratio1;
        }
        return answer;
    }
}
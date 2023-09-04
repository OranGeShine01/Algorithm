import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        double[][] rof = new double[N][2];
        int l = stages.length;
        for (int i=0; i<N; i++) {
            rof[i][0] = i+1;
            int chall = 0; // 해당 스테이지 도전자의 수
            int fail = 0; // 실패한 도전자의 수
            for (int j=0; j<l; j++) {
                if (stages[j]>=rof[i][0]) {
                    chall++;
                    if (stages[j]==rof[i][0]) {
                        fail++;
                    }
                }
            }
            if (chall==0) {
                rof[i][1] = 0;    
            } else {
                rof[i][1] = (double)fail/(double)chall;    
            }            
        }

        // 내림차순 정렬
        Arrays.sort(rof, new Comparator<double[]>() {
            @Override
            public int compare(double[] o1, double[] o2) {
                if (o1[1]==o2[1]) {
                    return Double.compare(o1[0], o2[0]);
                } else {
                    return -Double.compare(o1[1], o2[1]);
                }
            }
        });

        for (int i=0; i<N; i++) {
            answer[i] = (int)rof[i][0];
        }

        return answer;
    }
}
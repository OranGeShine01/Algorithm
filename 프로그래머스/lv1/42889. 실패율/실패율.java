import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        double[][] rof = new double[N][2]; // 스테이지별 실패율
        int l = stages.length;
        int[] countStages = new int[N+2]; // 스테이지별 인원 카운트

        for (int i : stages) {
            countStages[i]++;
        }

        int countChall = l;
        for (int i=0; i<N; i++) {
            rof[i][0] = i+1;
            if (countChall==0) {
                rof[i][1]=0;
            } else {
                rof[i][1] = (double)countStages[i+1]/(double)countChall;
            }
            countChall-=countStages[i+1];
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
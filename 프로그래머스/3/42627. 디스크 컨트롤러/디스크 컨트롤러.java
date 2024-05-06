import java.util.*;

class Solution {
    public int solution(int[][] jobs) {
        int answer = 0;
        
        // 현재 시간
        int curTime = 0;
        
        // jobs의 진행index
        int jobsIdx = 0;
        
        // 완료한 작업 수
        int jobsComplete = 0;
        
        // 현재시간까지 들어온 작업을 저장하는 priorityQueue
        PriorityQueue<int[]> pq = new PriorityQueue<>((o1, o2) -> Integer.compare(o1[1], o2[1]));
        
        // 작업 요청 시점 순으로 정렬
        Arrays.sort(jobs, (o1, o2) -> (Integer.compare(o1[0],o2[0])));
        
        while (jobsComplete < jobs.length) {
            
            // 현재 시간까지 들어온 작업을 pq에 삽입
            while (jobsIdx < jobs.length && curTime >= jobs[jobsIdx][0]) {
                pq.add(jobs[jobsIdx++]);
            }
            
            // 작업이 비어있다면, 다음 작업으로 넘어감
            if (pq.isEmpty()) {
                curTime = jobs[jobsIdx][0];
            } else {
                int[] curJob = pq.poll();
                curTime += curJob[1];
                answer += curTime - curJob[0];
                jobsComplete++;
            }
        }
        
        return answer / jobs.length;
    }
}
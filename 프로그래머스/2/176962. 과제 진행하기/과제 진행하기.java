import java.util.*;

class Solution {
    
    class Task {
        String name;
        int start;
        int workTime;
        
        public Task (String name, int start, int workTime) {
            this.name = name;
            this.start = start;
            this.workTime = workTime;
        }
        
        public Task (String name, int workTime) {
            this.name = name;
            this.workTime = workTime;
        }
    }
    
    public String[] solution(String[][] plans) {
        String[] answer = {};
        // 정답을 담을 queue
        Queue<String> q = new LinkedList<>();
        
        // 작업을 시작시간 순으로 저장하는 pq
        PriorityQueue<Task> pq = new PriorityQueue<>((o1, o2) -> o1.start - o2.start);
        
        // 잠시 멈춘 과제를 저장
        Stack<Task> stack = new Stack<>();
        
        // pq에 작업 저장
        for (int i=0; i<plans.length; i++) {
            String[] arr = plans[i][1].split(":");
            int time = Integer.parseInt(arr[0]) * 60 + Integer.parseInt(arr[1]);
            pq.add(new Task(plans[i][0], time, Integer.parseInt(plans[i][2])));
        }
        
        while(!pq.isEmpty()) {
            Task curTask = pq.poll();
            
            int curTime = curTask.start;
            
            // 새 과제가 남아있는 여부 판단
            if(!pq.isEmpty()) {
                Task nextTask = pq.peek();
                
                // 교체없이 현재 과제를 끝낼수 있는 case
                if (curTime + curTask.workTime < nextTask.start) {
                    q.add(curTask.name);
                    curTime += curTask.workTime;
                    
                    // 잠시 멈춘 과제가 남아있는 경우
                    while (!stack.isEmpty()) {
                        Task remainTask = stack.pop();
                        
                        // 과제 중간 교체 여부 판단
                        if (curTime + remainTask.workTime <= nextTask.start) {
                            curTime += remainTask.workTime;
                            q.add(remainTask.name);
                            continue;
                        } else {
                            int dt = curTime + remainTask.workTime - nextTask.start;
                            stack.push(new Task(remainTask.name, dt));
                            break;
                        }
                    }
                } else if (curTask.start + curTask.workTime == nextTask.start) {
                    q.add(curTask.name);
                    continue;
                } else {
                    stack.push(new Task(curTask.name, curTask.workTime + curTask.start - nextTask.start));
                }
            } else {
                // 남은 과제 유무 판단
                if (stack.isEmpty()) {
                    curTime += curTask.workTime;
                    q.add(curTask.name);
                } else {
                    q.add(curTask.name);
                    while (!stack.isEmpty()) {
                        q.add(stack.pop().name);
                        
                    }
                }
            }
        }
        
        answer = new String[q.size()];
        for (int i=0; i<answer.length; i++) {
            answer[i] = q.poll();
        }
        
        return answer;
    }
}
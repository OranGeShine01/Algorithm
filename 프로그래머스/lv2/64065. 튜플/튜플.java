import java.util.*;

class Solution {
    public int[] solution(String s) {
        int[] answer = {};
        
        List<List<Integer>> list = new ArrayList<>();
        
        String[] arr = s.split("\\},\\{");
        arr[0] = arr[0].substring(2);
        int l = arr.length;
        arr[l-1] = arr[l-1].substring(0, arr[l-1].length()-2);
        for (String str : arr) {
            String[] nums = str.split(",");
            List<Integer> subList = new ArrayList<>();
            for (String str2 : nums) {
                subList.add(Integer.parseInt(str2));
            }
            list.add(subList);
        }
        
        Collections.sort(list, new Comparator<List<Integer>>() {
            @Override
            public int compare (List<Integer> a, List<Integer> b) {
                return a.size()-b.size();
            }
        });
            
        answer = new int[list.size()];
        Set<Integer> set = new HashSet<>();
        for (int i=0; i<answer.length; i++) {
            if (i==0) {
                answer[i] = list.get(i).get(i);
                set.add(answer[i]);
            }
            else {
                for (Integer j : list.get(i)) {
                    if (!set.contains(j)) {
                        answer[i] = j;
                        set.add(j);
                        break;
                    }    
                }
            }
        }
        
        return answer;
    }
}
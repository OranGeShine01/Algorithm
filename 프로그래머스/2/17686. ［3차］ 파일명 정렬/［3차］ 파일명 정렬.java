import java.util.*;

class Solution {
    
    class File {
        String name;
        String head;
        int num;
        
        public File(String name, String head, int num) {
            this.name = name;
            this.head = head;
            this.num = num;
        }
    }
    
    public String[] solution(String[] files) {
        
        File[] arr = new File[files.length];
        
        for (int i=0; i<files.length; i++) {
            int start = 0;
            int end = 0;
            int l = files[i].length();
            
            for (int j=0; j<l; j++) {
                char ch = files[i].charAt(j);
                if (start==0 && Character.isDigit(ch)) {
                    start = j;
                    end = j;
                } else if (start!=0 && Character.isDigit(ch)) {
                    end++;
                } else if (start!=0 && !Character.isDigit(ch)) break;
                    
            }
            
            arr[i] = new File(files[i], files[i].substring(0, start).toLowerCase(), 
                              Integer.parseInt(files[i].substring(start, end+1)));
        }
        
        Arrays.sort(arr, (o1, o2) -> {
            if (o1.head.equals(o2.head)) return o1.num-o2.num;
            else return o1.head.compareTo(o2.head);
        });
        
        String[] answer = new String[files.length];
        
        for (int i=0; i<answer.length; i++) {
            answer[i] = arr[i].name;
        }
        return answer;
    }
}
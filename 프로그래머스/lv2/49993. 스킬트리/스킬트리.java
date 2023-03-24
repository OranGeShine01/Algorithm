import java.util.HashMap;
import java.util.Map;
class Solution {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;
        Map<Character, Integer> map = new HashMap<>();
        int l = skill_trees.length;
        int l2 = skill.length();
        for (int i=0; i<l2; i++) {
            map.put(skill.charAt(i), i);
        }
        for (int i=0; i<l; i++) {
            int count = -1; // 나온 스펠순서를 카운트
            boolean bl = true; // 스킬트리 가능여부를 판단
            for (int j=0; j<skill_trees[i].length(); j++) {
                char ch = skill_trees[i].charAt(j);
                if (map.containsKey(ch)) {
                    if (count+1==map.get(ch)) {
                        count = map.get(ch);
                    }
                    else {
                        bl = false;
                        break;
                    }
                }
            }
            if (bl) {
                System.out.println(skill_trees[i]);
                answer++;
            }
        }
        return answer;
    }
}
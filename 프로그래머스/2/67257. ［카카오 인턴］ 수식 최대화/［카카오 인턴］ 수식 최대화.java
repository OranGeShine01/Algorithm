import java.util.*;

class Solution {

    char[] oper = {'+', '-', '*'};
    long answer = 0;

    public long solution(String expression) {
        StringBuilder sb = new StringBuilder();
        ArrayList<Long> ints = new ArrayList<>();
        ArrayList<Character> opers = new ArrayList<>();

        char[] ch = expression.toCharArray();

        for (int i=0; i<ch.length; i++) {
            if (Character.isDigit(ch[i])) sb.append(ch[i]);
            else {
                ints.add(Long.parseLong(sb.toString()));
                sb.setLength(0);
                opers.add(ch[i]);
            }
        }
        ints.add(Long.parseLong(sb.toString()));
        fact(ints, opers, 0);

        return answer;
    }

    long cal(ArrayList<Long> ints, ArrayList<Character> opers) {
        for (char ch : oper) {
            for (int i=0; i<opers.size(); i++) {
                if (ch==opers.get(i)) {
                    switch (ch) {
                        case '+' :
                            ints.add(i, ints.remove(i) + ints.remove(i));
                            break;
                        case '-' :
                            ints.add(i, ints.remove(i) - ints.remove(i));
                            break;
                        case '*' :
                            ints.add(i, ints.remove(i) * ints.remove(i));
                            break;
                    }
                    opers.remove(i--);
                }
            }
        }
        return Math.abs(ints.get(0));
    }

    void fact (ArrayList<Long> ints, ArrayList<Character> opers, int depth) {
        if (depth==oper.length) {
            long a = cal((ArrayList<Long>)ints.clone(), (ArrayList<Character>)opers.clone());
            answer = Math.max(answer, a);
            return;
        }

        for (int i=depth; i<oper.length; i++) {
            swap(i, depth);
            fact(ints, opers, depth+1);
            swap(i, depth);
        }

    }

    void swap (int a, int b) {
        char temp = oper[a];
        oper[a] = oper[b];
        oper[b] = temp;
    }
}
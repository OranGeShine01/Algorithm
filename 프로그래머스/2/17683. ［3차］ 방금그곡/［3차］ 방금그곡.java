class Solution {
    public String solution(String m, String[] musicinfos) {
        String answer = "(None)";
        String ml = lyric(m);
        int l = ml.length();
        int[] t = new int[musicinfos.length];
        int cnt = 0;
        for (int i=0; i<musicinfos.length; i++) {
            String[] str = musicinfos[i].split(",");
            t[i] = time(str[1])-time(str[0]);
            String l3 = lyric(str[3]);
            int cycle = t[i]/l3.length();
            int mod = t[i]%l3.length();
            StringBuilder sb = new StringBuilder();
            for (int j=0; j<cycle; j++) {
                sb.append(l3);
            }
            sb.append(l3.substring(0, mod));
            if (sb.indexOf(ml)!=-1 && t[i]>cnt) {
                answer = str[2];
                cnt = t[i];
            }
        }
        return answer;
    }

    int time(String s) {
        String[] arr = s.split(":");
        return Integer.parseInt(arr[0]) * 60 + Integer.parseInt(arr[1]);
    }
    
    String lyric (String s) {
        StringBuilder sb = new StringBuilder();
        int l = s.length();
        for (int i=0; i<l; i++) {
            char ch = s.charAt(i);
            if (i!=l-1 && s.charAt(i+1)=='#') {
                sb.append(Character.toLowerCase(ch));
            } else if (ch=='#') continue;
            else sb.append(ch);
        }
        return sb.toString();
    }
}
class Solution {
    public int[] solution(String[] wallpaper) {
        final int len = 50;
        int[] answer = new int[4];
        answer[0] = len+1;
        answer[1] = len+1;
        for (int i=0; i<wallpaper.length; i++) {
            int l = wallpaper[i].length();
            int fi = wallpaper[i].indexOf('#');
            int li = wallpaper[i].lastIndexOf('#');
            if (fi!=-1) {
                answer[0] = Math.min(answer[0], i);
                answer[1] = Math.min(answer[1], fi);
            }
            if (li!=-1) {
                answer[2] = Math.max(answer[2], i+1);
                answer[3] = Math.max(answer[3], li+1);
            }
        }
        return answer;
    }
}
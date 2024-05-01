import java.util.*;

class Solution {
    public int[] solution(String[] genres, int[] plays) {
        
        // 장르별 총 재생수
        Map<String, Integer> genreTotalPlay = new HashMap<>();
        
        // 장르별 list
        Map<String, PriorityQueue<int[]>> genrePlayList = new HashMap<>();
        
        // 장르별로 data input
        for (int i = 0; i < genres.length; i++) {
            genreTotalPlay.put(genres[i], genreTotalPlay.getOrDefault(genres[i], 0) + plays[i]);
            genrePlayList.computeIfAbsent(genres[i], k -> new PriorityQueue<>(
                (o1, o2) -> {
                    if (o1[1] == o2[1]) return o1[0] - o2[0];
                    return o2[1] - o1[1];
                }
            )).add(new int[]{i, plays[i]});
        }
        
        // 장르 총 재생수로 정렬
        ArrayList<String> genreRank = new ArrayList(genreTotalPlay.keySet());
        Collections.sort(genreRank, (o1, o2) -> genreTotalPlay.get(o2) - genreTotalPlay.get(o1));
        
        ArrayList<Integer> answer = new ArrayList<>();
        for (String genre : genreRank) {
            int cnt = 0;
            while (!genrePlayList.get(genre).isEmpty() && cnt < 2) {
                answer.add(genrePlayList.get(genre).poll()[0]);
                cnt++;
            }
        }
        
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}
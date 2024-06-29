    import java.time.LocalDateTime;
    import java.time.ZoneId;
    import java.time.ZonedDateTime;
    import java.time.format.DateTimeFormatter;

    public class Main {

        public static void main(String[] args) {

            // 1. UTC+0의 현재 시간을 가져옵니다.
            LocalDateTime utcTime = LocalDateTime.now(ZoneId.of("UTC"));

            // 2. UTC+0 시간을 서울 시간으로 변환합니다.
            ZonedDateTime seoulTime = utcTime.atZone(ZoneId.of("Asia/Seoul"));

            // 3. 서울 시간에서 날짜를 포맷팅합니다.
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            String seoulDate = seoulTime.format(formatter);

            // 4. 출력합니다.
            System.out.println(seoulDate);

        }
    }
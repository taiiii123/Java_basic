/* 現在時刻を表示 */
import java.time.*;

public class Sample03 {
    public static void main(String[] args) {
        ZonedDateTime zdt = ZonedDateTime.now();
        System.out.println(zdt);
        
        // 基本的な時刻表現
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);

        // 時刻を指定して表示
        LocalDateTime d = LocalDateTime.of(2021, 12, 9, 17, 21, 30);
        System.out.println(d);

        // int型に変換して表示
        int year = d.getYear(); // 年
        int month = d.getMonthValue(); // 月
        int day = d.getDayOfMonth(); // 日
        int hour = d.getHour(); // 時
        int minute = d.getMinute(); // 分
        int second = d.getSecond(); // 秒
        System.out.println(year + "/" + month + "/" + day + " " + hour + ":" + minute + ":" + second);
    }
}

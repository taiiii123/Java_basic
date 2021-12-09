/* 現在時刻を表示 */
import java.time.*;

public class Sample03 {
    public static void main(String[] args) {
        ZonedDateTime zdt = ZonedDateTime.now();
        System.out.println(zdt);
        
        // 基本的な時刻表現
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
    }
}

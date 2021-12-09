/* 現在時刻を表示 */
import java.util.Date;

public class Sample03 {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);
        System.out.println(date.getTime()); // long値を取得

        // long値をDate型に変換
        Date date2 = new Date(date.getTime());
        System.out.println(date2);
        
        System.out.println("------------------------------");

        // 日付を表示
        System.out.println(date.getYear() + 1900); // 年
        System.out.println(date.getMonth()); // 月
        System.out.println(date.getDate()); // 日
        System.out.println(date.getHours()); // 時
        System.out.println(date.getMinutes()); // 分
        System.out.println(date.getSeconds()); // 秒
    }
}

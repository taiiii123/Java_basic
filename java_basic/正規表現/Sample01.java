import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* 正規表現 */

public class Sample01 {
    public static void main(String[] args) {
        String targetStr = "Java12345";
        
        // 文字列パターン
        Pattern p = Pattern.compile("[a-z][0-9]");
        
        // 文字列パターンにマッチする文字列を検索
        Matcher m = p.matcher(targetStr);

        // 結果を出力
        System.out.println("matches(): " + m.matches()); // 文字列全体がパターン文字列と合致するかどうかチェック
        System.out.println("find(): " + m.find()); // 文字列全体にパターン文字列が含まれるかどうかチェック
    }
}
/* Webページを取得する */
// java.net.URLクラスを使用する。

import java.io.InputStream;
import java.net.URL;

public class Sample04 {
    public static void main(String[] args) throws Exception {
        try {
            URL u = new URL("https://www.google.co.jp/");
            InputStream is = u.openStream(); // インターネットにアクセス
            int i = is.read(); // 1バイト読み込む
            while (i != -1) {
                System.out.print((char) i); // 1バイトを表示
                i = is.read(); // 次のバイトを読み込む
            }
        } catch(Exception e) {
            System.out.println("アクセス出来ませんでした。");
        }
    }
}

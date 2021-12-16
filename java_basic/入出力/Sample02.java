/* ファイル入出力2 - 読み込み */
/* 
java.io.BufferedReaderを使用
BufferedReaderクラスのreadLineメソッドで読み込み
1行字ずつ読み込む
*/
import java.io.*;

public class Sample02 {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("data.txt"));
            String line = br.readLine();
            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }
            br.close();
        }catch(Exception e) {
            System.out.println("ファイルが見つかりません");
        }
    }
}

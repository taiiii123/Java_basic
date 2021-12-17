/* ファイル入出力4 - 書き込み(追加) */
/* 
java.io.FileWriteを使用
FileWriterクラスのwriteメソッドで書き込み
1文字ずつ書き込む
FileWriter("ファイル名", true)で追加書き込み
*/
import java.io.*;


public class Sample04 {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("data2.txt", true); // 新規作成(上書き)
            fw.write("\r\nHello"); // 文字列を書き込む
            fw.close();
        } catch(Exception e) {
            System.out.println("ファイルが見つかりません");
        }
    }
}

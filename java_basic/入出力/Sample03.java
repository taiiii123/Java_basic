/* ファイル入出力3 - 書き込み(上書き) */
/* 
java.io.FileWriteを使用
FileWriterクラスのwriteメソッドで書き込み
1文字ずつ書き込む
*/
import java.io.*;


public class Sample03 {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("data2.txt");
            fw.write("こんにちは"); // 文字列を書き込む
            fw.close();
        } catch(Exception e) {
            System.out.println("ファイルが見つかりません");
        }
    }
}

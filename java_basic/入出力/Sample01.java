/* ファイル入出力1 - 読み込み1 */
/* 
java.io.FileReaderを使用
FileReaderクラスのreadメソッドで読み込み
1文字ずつ読み込む
*/
import java.io.*;


public class Sample01 {
    public static void main(String args[]) {
        try {
            FileReader fr = new FileReader("data.txt"); // ファイルを読み込む
            int input = fr.read();

            // ファイルを読み込んだら、ファイルを閉じる
            while (input != -1) { // -1はEOF
                System.out.print((char)input);
                input = fr.read();
            }
            fr.close();
        } catch(Exception e) {
            System.out.println("ファイルが見つかりません");
        } 
    }
}
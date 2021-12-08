/* formatメソッドで文字列の整形 */

public class Sample06 {
    public static void main(String[] args) {
        int i = 123;
        float f = 1.23f;
        double d = 1.23;
        String s = "Java";
        boolean b = true;

        String msg = String.format("%d, %f, %f, %s, %b", i, f, d, s, b);
        System.out.println(msg);

        // printlnだとエラー
        System.out.printf("%d, %f, %f, %s, %b", i, f, d, s, b);
    }
}

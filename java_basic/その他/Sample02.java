/* 処理時間を計測する */

public class Sample02 {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        // 時間計測をしたい処理
        int result = 0;
        for (int i = 0; i < 1000000; i++) {
            result += 1;
        }

        long endTime = System.currentTimeMillis();

        System.out.println("処理時間：" + (endTime - startTime) + "ミリ秒");
    }
}

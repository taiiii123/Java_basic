import java.util.Arrays;

class Sample05{
    public static void main(String[] args){
        
        int[] src = {1, 2, 3, 4, 5};

        System.out.println(src);

        // 配列の文字列表現を取得
        System.out.println(Arrays.toString(src));

        int[][] src2 = {{1, 2, 3}, {4, 5, 6}};

        System.out.println(src2);
        // 多次元配列でtoString()メソッドを用いた場合、格納された要素を参照して出力する
        System.out.println(Arrays.toString(src2));
        // 多次元配列の文字列表現を取得
        System.out.println(Arrays.deepToString(src2));
    }
}
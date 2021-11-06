import java.util.Arrays;

class Sample01{
    public static void main(String args[]){
        
        // 配列の宣言と初期化
        int[] x1 = new int[3];
        x1[0] = 10;
        x1[1] = 20;
        x1[2] = 30;
        for(int i=0; i<x1.length; i++){
            System.out.println(x1[i]);
        }
        
        int[] x2 = {10, 20, 30};
        for(int i=0; i<x2.length; i++){
            System.out.println(x2[i]);
        }
        
        // 配列の長さを取得
        int[] x3 = new int[3];
        System.out.println(x3.length);
        
        // 二次元配列の宣言と初期化
        int[][] x4 = {
            {10, 20, 30},
            {30, 40, 60}
        };
        System.out.println(Arrays.deepToString(x4));
        
        String[][] x5 = {
            {"one", "two"},
            {"ichi", "ni"}
        };
        for(int i=0; i<2; i++){
            System.out.println(x5[i][0]);
        }
        for(int i=0; i<2; i++){
            System.out.println(x5[i][1]);
        }
        
        // オブジェクトの配列
//        classA[] xx = new classA[3];
//        xx[0] = new classA{};
//        xx[1] = new classA{};
//        xx[2] = new classA{};
        
    }
}
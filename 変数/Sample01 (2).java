class Samople02{
    public static void main(String[] args){
        
        // 真偽値
        boolean a = true;
        System.out.println(a);
        
        // char, int, float, long
        char b = 'a';
        String c = "abc";
        int d = 1;
        float e = 1.23F;
        double f = 1.23e4;
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        // 文字列のとき、''(シングルクォーテーション)は使えない
        
        float f1 = Float.NaN;                  // 非数（Not a Number）
        float f2 = Float.POSITIVE_INFINITY;    // 正の無限大
        float f3 = Float.NEGATIVE_INFINITY;    // 負の無限大
        double d1 = Double.NaN;                // 非数（Not a Number）
        double d2 = Double.POSITIVE_INFINITY;  // 正の無限大
        double d3 = Double.NEGATIVE_INFINITY;  // 負の無限大
        System.out.println(f1);
        System.out.println(f2);
        System.out.println(f3);
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
        
        // キャスト(型変換)
        System.out.println("1.23F(int) =>" + (int)e);
    }
}
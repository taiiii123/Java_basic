public class Sample02 {
    public static void main(String[] args) {
        System.out.println(plus(10, 20));
        System.out.println(plus(10.5, 20.0));
        System.out.println(plus(10, 20.5));
        System.out.println(plus(10.5, 20));
        System.out.println(plus("Hello", "World"));    
    }

    public static int plus(int x, int y){
        System.out.println("int + int");
        return x + y;
    }
    
    // オーバーロード
    public static double plus(int x, double y){
        System.out.println("int + double");
        return x + y;
    }
    
    // オーバーロード
    public static double plus(double x, int y){
        System.out.println("double + int");
        return x + y;
    }
    
    // オーバーロード
    public static double plus(double x, double y){
        System.out.println("double + double");
        return x + y;
    }
    
    // オーバーロード
    public static String plus(String x, String y){
        System.out.println("String + String");
        return x + y;
    }
}

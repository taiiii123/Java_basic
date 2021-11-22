class Sample02 {
    public static void main(String[] args) {
        // 例外処理を行う 
        try {
            // 例外が発生する可能性がある処理
            int i = 1 / 0;
        } catch (ArithmeticException e) {
            // 例外が発生した場合の処理
            System.out.println("An exception was raised.");
        }
    }
}

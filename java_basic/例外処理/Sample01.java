class Sample01 {
    public static void main(String[] args){
        // 例外を受け取る try-catch-finally

        // try ブロック
        try {
            // 処理
            System.out.println("try");
        } catch (Exception e) {
            // catch ブロック
            System.out.println("catch");
        } finally {
            // finally ブロック
            System.out.println("finally");
        }
    }
}

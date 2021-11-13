class Sample01 {
    public static void main(String[] args) {
        
        // コマンド引数
        int i = 1;
        for(String s : args) {
            System.out.println("コマンドライン引数[" + i + "] = " + s);
        }

        for(i = 0; i < args.length; i++) {
            System.out.print(args[i] + " ");
        }
    }
}

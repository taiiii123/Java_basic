class Sample01 {
    public static void main(String[] args) {
        
        // コマンド引数
        int i = 0;
        for(String s : args) {
            System.out.println("コマンドライン引数[" + i + "] = " + s);
            i++;
        }

        for(i = 0; i < args.length; i++) {
            System.out.print(args[i] + " ");
        }
    }
}

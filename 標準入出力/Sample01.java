import java.util.Scanner;

class Sample01{
    public static void main(String[] args){
        // 標準入力
        Scanner scanner = new Scanner(System.in);

        // 入力(文字列)
        System.out.print("文字列を入力してください：");
        String str = scanner.nextLine();
        
        // 標準出力
        System.out.println("入力された文字列は" + str + "です。");

        // 入力(数値)
        System.out.print("数値を入力してください：");
        int num = scanner.nextInt();

        // 標準出力
        System.out.println("入力された数値は" + num + "です。");

        // 入力(複数)
        System.out.print("複数の値を入力してください：");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        // 標準出力
        System.out.println("入力された数値は" + num1 + "と" + num2 + "です。");
        scanner.close();
    }
}
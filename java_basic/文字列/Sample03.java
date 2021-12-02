public class Sample03 {
    public static void main(String[] args){
        /* 文字列の取得 */
        String str = "Hello, World!";

        // String.charAt(index) -> 指定位置の1文字を取得
        System.out.println(str.charAt(7)); // W

        // String.substring(fastIndex, endIndex) -> 指定位置から始まる文字列を取得
        System.out.println(str.substring(7)); // World!
        System.out.println(str.substring(2, 5)); // llo

        System.out.println("----------------------------");

        /* 文字列の変換する */

        // String.toUpperCase() -> 大文字に変換
        System.out.println(str.toUpperCase()); // HELLO, WORLD!

        // String.toLowerCase() -> 小文字に変換
        System.out.println(str.toLowerCase()); // hello, world!
        
        // String.trim() -> 先頭と末尾の空白文字を削除
        str = "   Hello, World!   ";
        System.out.println(str.trim()); // Hello, World!

        // String.replace(oldChar, newChar) -> 文字列内のoldCharをnewCharに置換
        str = "Hello, World!";
        System.out.println(str.replace('l', 'L')); // HeLLo, WorLd!

    }
}

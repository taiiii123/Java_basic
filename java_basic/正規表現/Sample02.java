
public class Sample02 {
    public static void main(String[] args) {
        String s = "Java";

        System.out.println(s.matches("Java")); // true
        System.out.println(s.matches("JavaJava")); // false
        System.out.println(s.matches("java")); // false
        System.out.println("--------------------------------");
        
        // ➀ピリオド(.):任意の一文字を意味する
        System.out.println(s.matches("J.va")); // true
        System.out.println("--------------------------------");
        
        // ➁アスタリスク(*):複数の文字(0回以上の文字)を意味する
        s = "Javaaaaaaaaaa";
        System.out.println(s.matches("Java*")); // true
        System.out.println(s.matches("Java*a")); // true
        System.out.println("--------------------------------");
        
        s = "あいうえおaiueo0123";
        System.out.println(s.matches(".*")); // true
        System.out.println(s.matches("あいう.*")); // true
        System.out.println("--------------------------------");
        
        // ➂波括弧:指定回数の繰り返し
        // {n} -> n回
        // {n,} -> n回以上
        // {n,m} -> n回以上m回以下
        // ? -> 0回または1回
        // + -> 1回以上
        // * -> 0回または1回以上
        s = "Javaaaaaaaaaaaaa";
        System.out.println(s.matches("Java{2,}")); // true
        System.out.println("--------------------------------");
        
        // ➃括弧:指定した文字のいずれかを意味する
        // [abc] -> a,b,cのいずれか
        // [^abc] -> a,b,c以外の文字
        // [a-z] -> aからzまで
        // [^a-z] -> aからz以外の文字
        // [a-zA-Z] -> aからzまで(大文字小文字を区別しない)
        // [^a-zA-Z] -> aからz以外の文字(大文字小文字を区別しない)
        s = "Java";
        System.out.println(s.matches("Ja[dwv]a")); // true
        System.out.println("--------------------------------");
        
        // ➅ハットとダラー:先頭と末尾
        // ^ -> 先頭
        // $ -> 末尾
        s = "Java";
        System.out.println(s.matches("^Java")); // true
        System.out.println(s.matches("^J")); // false
        System.out.println(s.matches("Java$")); // true
        System.out.println(s.matches("a$")); // false
    }
}
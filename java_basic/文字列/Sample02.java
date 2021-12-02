public class Sample02 {
    public static void main(String[] args) {
        /* 文字列を検索 */
        String s = "Java and JavaScript";

        // 検索対象の文字列.contains(文字列s) -> 一部に文字列sを含まれるかどうかを判定する
        if(s.contains("and")) {
            System.out.println("andを含む");
        }else{
            System.out.println("andを含まない");
        }

        // 検索対象の文字列.startsWith(文字列s) -> 文字列sで始まるかどうかを判定する
        if(s.startsWith("Java")) {
            System.out.println("Javaで始まる");
        }else{
            System.out.println("Javaで始まらない");
        }

        // 検索対象の文字列.endsWith(文字列s) -> 文字列sで終わるかどうかを判定する
        if(s.endsWith("Script")) {
            System.out.println("Scriptで終わる");
        }else{
            System.out.println("Scriptで終わらない");
        }

        // 検索対象の文字列.indexOf(文字列s) -> 文字列sが最初に現れる位置を返す
        int index = s.indexOf("Java");
        System.out.println("Javaの位置は" + index);

        // 検索対象の文字列.lastIndexOf(文字列s) -> 文字列sが最後から検索して現れる位置を返す
        index = s.lastIndexOf("Java");
        System.out.println("Javaの位置は" + index);

    }
}
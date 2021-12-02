class Sample {
    public static void main(String[] args) {
        /* 文字列を調査 */
        String s1 = "Java";
        String s2 = "java";
        String s3 = "Sample";

        // 文字列1.equals(文字列2) -> 内容が等しいか調べる
        if(s1.equals(s2)) {
            System.out.println(s1 + "と" + s2 + "の内容は等しい");
        }else{
            System.out.println(s1 + "と" + s2 + "の内容は等しくない");
        }

        // 文字列1.equalsIgnoreCase(文字列2) ->　大文字、小文字を区別せずに等しいかを調べる
        if(s1.equalsIgnoreCase(s2)) {
            System.out.println(s1 + "と" + s2 + "は等しい");
        }else{
            System.out.println(s1 + "と" + s2 + "は等しくない");
        }

        // 文字列1.length() -> 文字列長を調べる
        System.out.println(s1 + "の長さは" + s1.length() + "です");

        // 文字列1.isEmpty() -> 空文字(長さが0か)を調べる
        if(s1.isEmpty()){
            System.out.println(s1 + "は空文字です");
        }else{
            System.out.println(s1 + "は空文字ではありません");
        }
    }
}
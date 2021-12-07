public class Sample05 {
    public static void main(String[] args) {
        // splitメソッドを使った文字列を分割
        String str1 = "Java,JavaScript,C,Python";
        String[] strArray1 = str1.split(",");
        for (String s : strArray1) {
            System.out.println(s);
        }
        
        String  str2 = "abc,def:ghi";
        String[] strArray2 = str2.split("[,:]"); // 正規表現[]で指定
        for (String s : strArray2) {
            System.out.println(s);
        }
        System.out.println("---------------------------------");

        // joinメソッドを使って分割した文字列を結合
        String str3 = "Java,JavaScript,C,Python";
        String[] strArray3 = str3.split(",");
        String str4 = String.join(":", strArray3);
        System.out.println(str4);
        System.out.println("---------------------------------");

        // replaceメソッドを使って文字列を置換
        String str5 = "Java,JavaScript,C,Python";
        String str6 = str5.replace(",", ":");
        System.out.println(str6);
        System.out.println("---------------------------------");

        // replaceAllメソッドを使って文字列を置換
        String str7 = "Java,JavaScript,C,Python";
        String str8 = str7.replaceAll(",", ":");
        System.out.println(str8);

        String str9 = "Java,JavaScript,C,Python";
        String str10 = str9.replaceAll("[JSP]", "X");
        System.out.println(str10);
    }
}
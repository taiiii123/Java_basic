public class  Sample04 {
    public static void main(String[] args) {
        // 文字列の連結(遅い)
        String str1 = "Hello";
        String str2 = "World";
        String str3 = str1 + " " + str2;
        System.out.println(str3);
        
        //文字列の連結(高速: StringBuilder)
        StringBuilder sb = new StringBuilder();
        sb.append(str1);
        sb.append(" ");
        sb.append(str2);
        System.out.println(sb.toString());

        // join()メソッド -> 高速
        String[] strArray = {"Hello", "World"};
        String str4 = String.join(" ", strArray);
        System.out.println(str4);

        String str = String.join(",", "apple", "orange", "melon");
        System.out.println(str);
    }
}
class Sample01{
    public static void main(String[] args){
        
        // 静的言語で型を宣言する必要がある。
        String str = "String";
        System.out.println(str);

        // 文字列の代入
        str = String.format("%s2", str);
        System.out.println(str);
    }
}
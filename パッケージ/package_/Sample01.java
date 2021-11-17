
public class Sample01 {
    
    public static void main(String[] args) {
        // パッケージ

        pkgA.Sample02 s02 = new pkgA.Sample02();
        pkgA.pkgB.Sample03 s03 = new pkgA.pkgB.Sample03();
        s02.print();
        s03.print();
    }
}

import pkgA.Sample02;
import pkgA.Sample02;
import static pkgA.Sample02.print3;
import pkgA.pkgB.Sample03;
import pkgA.pkgB.Sample03;

public class Sample01 {
    
    public static void main(String[] args) {
        // インスタンス生成して、メソッド呼び出し
        Sample02 s02 = new Sample02();
        Sample03 s03 = new Sample03();
        s02.print1();
        s03.print1();

        // インポートしたクラスのメソッドを呼び出す
        Sample02.print2();
        Sample03.print2();

        // import staticで指定したメソッドを呼び出す
        print3();
    }
}

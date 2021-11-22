/* 継承 pyblic abstract 戻り値 メソッド名(引数); */

class Sample06 {
    public static void main(String[] args) {
        SubSample1 sub1 = new SubSample1();
        SubSample2 sub2 = new SubSample2();

        sub1.print();
        sub2.print();
    }
}

// 抽象クラス 直接インスタンス化できない。また、多重継承はできない。
abstract class Sample{
    // 抽象メソッド -> メソッドのオーバーライドができる
    public abstract void print();
}

// サブクラス1
public class SubSample1 extends Sample{
    // 抽象メソッドのオーバーライド
    @Override
    public void print() {
        System.out.println("SubSample1");
    }
}

// サブクラス2
public class SubSample2 extends Sample{
    // 抽象メソッドのオーバーライド
    @Override
    public void print() {
        System.out.println("SubSample2");
    }
}

class Sample03 {
    public static void main(String[] args) {
        SuperClass superClass = new SuperClass();
        superClass.calc(2);

        SubClass subClass = new SubClass();
        subClass.calc(2);
    }
}

// スーパークラス
public class SuperClass {
    public void calc(int x){
    System.out.println("super class");
    System.out.println("x * 2 = " + (x * 2)); 
    }
}

// サブクラス
class SubClass extends SuperClass {
    // オーバーライド
    @Override
    public void calc(int x){
    System.out.println("sub class");
    System.out.println("x * 3 = " + (x * 3)); // サブクラスの処理を変更
    }
}


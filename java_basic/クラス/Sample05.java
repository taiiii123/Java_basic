/* 継承 super 親クラスのコンストラクタ、変数、メソッドを参照 */
public class Sample05 {
    public static void main(String[] args) {
        SubClass sub = new SubClass();
        sub.print();
    }
}

class ClassSample {

    public ClassSample() {
        System.out.println("ClassSample");
    }

    String str = "SuperClass";

    public String getStr() {
        return "get " + str;
    }
}

class SubClass extends ClassSample {
    String str = "SubClass";

    // 親クラスのコンストラクタを呼び出す
    public SubClass() {
        super();
        System.out.println("----------------------");
    }


    public String getStr() {
        return "get" + str;
    }

    public void print() {
        // 親クラスの変数を呼び出す
        System.out.println("super.str = " + super.str);
        System.out.println("str = " + str);
        
        System.out.println("----------------------");
        
        // 親クラスのメソッドを呼び出す
        System.out.println("super.getStr() = " + super.getStr());
        System.out.println("getStr() = " + getStr());
    }
}
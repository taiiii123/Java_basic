/* instanceof -> オブジェクト（インスタンス）が、指定したクラスまたはその上位のクラスに属しているかどうかを調べる*/

class Sample12 {
    public static void main(String[] args) {
        // オブジェクトのデータ型確認
        Object obj = "str";
        System.out.println(obj instanceof String);
        System.out.println(obj instanceof Integer);
        System.out.println("------------------------------");

        // クラスの確認
        SuperClass superClass = new SuperClass();
        System.out.println(superClass instanceof SuperClass);
        System.out.println("------------------------------");

        // 継承クラスの確認
        SubClass sub = new SubClass();
        System.out.println(sub instanceof SuperClass);
        System.out.println(sub instanceof SubClass);
        System.out.println("------------------------------");

        // インターフェースの確認
        SubInterfaceClass subInterface = new SubInterfaceClass();
        System.out.println(subInterface instanceof Interface);
        System.out.println(subInterface instanceof InterfaceClass);
        System.out.println(subInterface instanceof SubInterfaceClass);
        System.out.println("------------------------------");

        // instanceofの注意点
        // 左辺にnullが指定されていた場合はfalse
        String str = null;
        System.out.println(str instanceof Object);
    }
}

// 親クラス
class SuperClass {
   ; 
}

// 継承クラス
class SubClass extends SuperClass {
    ;
}

// インターフェース
interface Interface {
    ;
}


class InterfaceClass implements Interface{
    ;
}

class SubInterfaceClass extends InterfaceClass {
    ;
}

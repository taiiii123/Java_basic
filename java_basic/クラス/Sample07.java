/*  インターフェース (public) class クラス名 implements  インタフェース名 { 処理 }
インターフェース -> アクセス修飾子 interface インターフェース名{ 処理 } 
インターフェースの実装 -> public class クラス名 implements インターフェース名{ 処理 }

ポイント
1.よく機能を表す動詞＋ableのような形で、インターフェースを定義する。
2.継承との大きな違いとして、インターフェースはいくつでも実装することができます。
これにより、抽象クラスで多重継承できない問題が解決される。
ex)
class Human implements runnable, swimmable, flyable{
    処理
}
*/

// 実行
public class Sample07 {
    public static void main(String[] args){
        // Humanクラスのインスタンス化
        Human human = new Human();

        human.setName("Mike");
        human.setAge(20);

        System.out.println("Name : " + human.getName());
        System.out.println("Age  : " + human.getAge());
    }
}

// インターフェースの宣言
interface Nameable{
    public void setName(String name);
    String getName();
}

interface Ageable{
    public void setAge(int age);
    int getAge();
}

// 2つのインターフェースを実装
class Human implements Nameable, Ageable{
    private String name;
    private int age;

    // 名前を設定するメソッド
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }

    // 年齢を設定するメソッド
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return this.age;
    }
}
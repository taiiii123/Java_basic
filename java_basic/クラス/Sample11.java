/* 
カプセル化 private アクセス修飾子
オブジェクト内のクラスやメソッド、フィールドに対して外部からアクセスできない仕組み

ゲッター(getter)、セッター(setter)を利用することで、privateにしたフィールドも取得、変更できる。
ゲッター(getter)…フィールド変数に格納された値を取得するために利用されるメソッド
ex.)
private String name;
 
public String getName() {
  return name;
}

セッター(setter)…フィールド変数に値を設定するために利用されるメソッド
ex.)
private String name;
public void setName(String name) {
  this.name = name;
}
*/

class Sample11 {
    public static void main(String[] args) {
        Human human = new Human("Jon");
        human.setName("Mike");

        System.out.println("Name : " + human.getName());
    }
}

class Human {
    // カプセル化
    private String name;

    // コンストラクタ
    Human(String name) {
        this.name = name;
    }

    // nameのゲッター(取得)
    public String getName() {
        return this.name;
    }

    // nameのセッター(設定)
    public void setName(String name) {
        this.name = name;
    }

}

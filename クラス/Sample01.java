class Sample01{
    public static void main(String[] args){
        // Personクラスのインスタンスを生成
        Person person = new Person();
        // 変数の初期化を行うメソッドを呼び出す
        person.setName("Tabaka");
        person.setAge(20);
        // 名前と年齢を表示するメソッドを呼び出す
        person.print();
    }
}

// Personクラスを定義
class Person{
    String myName;
    int myAge;
    // 変数の初期化を行うメソッド
    public void setName(String name){
        myName = name;
    }
    public void setAge(int age){
        myAge = age;
    }

    // 名前と年齢を表示するメソッド
    public void print(){
        System.out.println("Name:" + myName);
        System.out.println("Age :" + myAge);
    }
}

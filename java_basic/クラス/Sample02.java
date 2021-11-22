class Sample02 {
    /* コンストラクタ */
    public static void main(String[] args) {
        Person tanaka = new Person("tanaka");
        tanaka.print();
    }
}

class Person{
    String myName;
    // コンストラクタ -> クラス名と同じ名前のメソッド
    Person(String name){
        myName = name;
    }
    public void print(){
        System.out.println("Hello, " + myName);
    }
}

// ※デストラクタは使用不可
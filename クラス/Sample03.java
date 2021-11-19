class Sample03 {
    public static void main(String[] args) {
        Person person = new Person("tanaka", 20);
        person.print();
    }
}

class Person {
    // フィールド
    private String name;
    private int age;

    // コンストラクタ
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // メソッド
    public void print() {
        System.out.println("Name:" + this.name);
        System.out.println("Age:" + this.age);
    }
}
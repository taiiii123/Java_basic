/* 
インターフェースの継承と実装
(public) class クラス名 extends 親クラス implemnts 親インターフェース1, 親インターフェース2 { 処理 }
*/


// 実行
class Sample09 {
    public static void main(String[] args) {
        PersonA personA = new PersonA();
        
        personA.sayHello();

        personA.setName("Mike");
        personA.setAge(20);

        System.out.println("Nsame : " + personA.getName());
        System.out.println("Age  : " +personA.getAge());
    }
}

// 抽象クラスの定義
abstract class Hello {
    public abstract void sayHello();
}

// インタフェースの定義
interface Nameable{
    public void setName(String name);
    String getName();
}

interface Ageable{
    public void setAge(int age);
    int getAge();
}


// 抽象クラスとインタフェースの継承
class PersonA extends Hello implements Nameable, Ageable{
    private String name;
    private int age;

    @Override
    public void sayHello() {
        System.out.println("Hello");
    }

    @Override
    public void setName(String name){
        this.name = name;
    }

    @Override
    public String getName(){
        return this.name;
    }

    @Override
    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return this.age;
    }
}
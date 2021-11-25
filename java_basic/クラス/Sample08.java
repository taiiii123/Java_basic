/* 
インターフェースの継承 (public) interface インターフェース名 extends 親インタフェース { 処理 } 
多重継承が可能
*/


// 実行
class Sample08 {
    public static void main(String[] args) {
        PersonA personA = new PersonA();
        
        personA.setName("Mike");
        personA.setAge(20);

        System.out.println("Nsame : " + personA.getName());
        System.out.println("Age  : " +personA.getAge());
    }
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

// インタフェースの継承
interface Person extends Nameable, Ageable{
    public void setName(String name);
    public void setAge(int age);
    public String getName();
    public int getAge();
}

// クラスの定義
class PersonA implements Person{
    private String name;
    private int age;
    
    @Override
    public void setName(String name){
        this.name = name;
    }
    
    @Override
    public void setAge(int age){
        this.age = age;
    }
    
    @Override
    public String getName(){
        return this.name;
    }
    
    @Override
    public int getAge(){
        return this.age;
    }
}   
/* 
多態性(ポリモーフィズム)…「抽象クラス」や「インターフェース」などを利用してメソッドの呼び出し方法を共通化し、
さらに「オーバーライド」させることで同じメソッドを呼び出しても、実際のインスタンス毎にその挙動を変化させようとするものです。

多態性のメリット
- 可読性が高くなる
- クラスの複雑さが減る(修正がしやすくなる)
*/

// 通常
// class Sample10 {
//     public static void main(String[] args) {
//         Dog dog = new Dog();
//         dog.bark();

//         Cat cat = new Cat();
//         cat.bark();

//         Duck duck = new Duck();
//         duck.bark();

//         Cow cow = new Cow();
//         cow.bark();

//         Sheep sheep = new Sheep();
//         sheep.bark();
//     }
// }

// 多態性(ポリモーフィズム)
class Sample10 {
    public static void main(String[] args) {
        // クラスの呼び出しを共通化して処理する
        Animal animal1 = new Dog();
        Animal animal2 = new Cat();
        Animal animal3 = new Duck();
        Animal animal4 = new Cow();
        Animal animal5 = new Sheep();

        Animal[] animals = {animal1, animal2, animal3, animal4, animal5};

        // 直接クラスにアクセスして、配列に格納する方法
        // Animal[] animals = {new Dog(), new Cat(), new Duck(), new Cow(), new Sheep()};

        for(Animal animal : animals) {
            animal.bark();
        }
    }
}

abstract class Animal {
    abstract void bark();
}

class Dog extends Animal {
    @Override
    void bark() {
        System.out.println("ワンワン");
    }
}

class Cat extends Animal {
    @Override
    void bark() {
        System.out.println("ニャー");
    }
}

class Duck extends Animal {
    @Override
    void bark() {
        System.out.println("ガーガー");
    }
}

class Cow extends Animal {
    @Override
    void bark() {
        System.out.println("モーモー");
    }
}

class Sheep extends Animal {
    @Override
    void bark() {
        System.out.println("メ―");
    }
}
/* 
���Ԑ�(�|�����[�t�B�Y��)�c�u���ۃN���X�v��u�C���^�[�t�F�[�X�v�Ȃǂ𗘗p���ă��\�b�h�̌Ăяo�����@�����ʉ����A
����Ɂu�I�[�o�[���C�h�v�����邱�Ƃœ������\�b�h���Ăяo���Ă��A���ۂ̃C���X�^���X���ɂ��̋�����ω������悤�Ƃ�����̂ł��B

���Ԑ��̃����b�g
- �ǐ��������Ȃ�
- �N���X�̕��G��������(�C�������₷���Ȃ�)
*/

// �ʏ�
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

// ���Ԑ�(�|�����[�t�B�Y��)
class Sample10 {
    public static void main(String[] args) {
        // �N���X�̌Ăяo�������ʉ����ď�������
        Animal animal1 = new Dog();
        Animal animal2 = new Cat();
        Animal animal3 = new Duck();
        Animal animal4 = new Cow();
        Animal animal5 = new Sheep();

        Animal[] animals = {animal1, animal2, animal3, animal4, animal5};

        // ���ڃN���X�ɃA�N�Z�X���āA�z��Ɋi�[������@
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
        System.out.println("��������");
    }
}

class Cat extends Animal {
    @Override
    void bark() {
        System.out.println("�j���[");
    }
}

class Duck extends Animal {
    @Override
    void bark() {
        System.out.println("�K�[�K�[");
    }
}

class Cow extends Animal {
    @Override
    void bark() {
        System.out.println("���[���[");
    }
}

class Sheep extends Animal {
    @Override
    void bark() {
        System.out.println("���\");
    }
}
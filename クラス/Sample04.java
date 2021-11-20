/* 継承  class クラス名 extends 元のクラス名 */
public class Sample04 {
    public static void main(String[] args) {
        SubClassSample sub = new SubClassSample();
    } 
}

class ClassSample {
    public ClassSample() {
        System.out.println("ClassSample");
    }
}

// 継承
class SubClassSample extends ClassSample {
    public SubClassSample() {
        System.out.println("SubClassSample");
    }
}
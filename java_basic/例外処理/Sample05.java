
class Sample05 {
    public static void main(String[] args) {
        try {
            methodA();
        } catch (MyException e) {
            System.out.println("An exception was raised.");
        }
    }

    // 例外を投げる(throws)
    static void methodA() throws MyException {
        System.out.println("methodA");
        MyException e = new MyException("Error!!");
        throw e;
    }
}

class MyException extends Exception {
    MyException(String msg) { 
        System.out.println(msg); 
    }
}

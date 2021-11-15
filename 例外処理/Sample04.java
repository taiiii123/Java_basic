class Sample04 {
    public static void main(String[] args){
        // 例外を投げる(throw)
        try{
            throw new ArrayIndexOutOfBoundsException();
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("I caught an exception.");
        }

        System.out.println("-----------------");
        throw new RuntimeException("I threw an exception.");
    }
}

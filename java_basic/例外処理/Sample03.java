class Sample03 {
    public static void main(String[] args){
        // 例外処理を行う

        /* nullのオブジェクトにアクセス時 */
        try{
            String s = null;
            System.out.println(s.toUpperCase());
        }catch(NullPointerException e){
            System.out.println("A NullPointerException was caught.");
        }catch(Exception e){
            System.out.println("Unknown exception");
        }

        /* 配列のインデックスが負の場合や配列のサイズ以上の場合 */
        try{
            int[] array = {1, 2, 3};
            System.out.println(array[3]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Out of range exception.");
        }catch(Exception e){
            System.out.println("Unknown exception");
        }
    }
}

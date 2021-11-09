import java.util.Arrays;

class Sample03{
    public static void main(String[] args){
        
        // 要素の範囲を決めて、配列を生成
        int[] src = {1, 2, 3, 4, 5};
        int[] copy_range = Arrays.copyOfRange(src, 1, 3);

        System.out.println(Arrays.toString(src));
        System.out.println(Arrays.toString(copy_range));
        System.out.println("------------------------");

        // 配列の連結
        int[] src1 = {1, 2, 3, 4, 5};
        int[] src2 = {6, 7, 8};
        int[] concat_list = new int[src1.length + src2.length];

        System.arraycopy(src1, 0, concat_list, 0, src1.length);
        System.arraycopy(src2, 0, concat_list, src1.length, src2.length);

        System.out.println(Arrays.toString(src1));
        System.out.println(Arrays.toString(src2));
        System.out.println(Arrays.toString(concat_list));
    }
}
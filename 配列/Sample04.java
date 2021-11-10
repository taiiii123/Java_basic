import java.util.Arrays;

class Sample04 {
	public static void main(String[] args) {

        //1次元の配列の中身を比較
        int[] a = {1, 2, 3};
        int[] b = {1, 2, 3};
        int[] c = {1, 2, 4};

        System.out.println(Arrays.equals(a, b)); //true
        System.out.println(Arrays.equals(a, c)); //false

        // 2次元の配列の中身を比較
        int[][] a2 = {{1, 2, 3}, {4, 5, 6}};
        int[][] b2 = {{1, 2, 3}, {4, 5, 6}};
        int[][] c2 = {{1, 2, 3}, {4, 5, 7}};

        System.out.println(Arrays.deepEquals(a2, b2)); //true
        System.out.println(Arrays.deepEquals(a2, c2)); //false

        // 配列の要素を昇順にソート
        int[] src = {3, 6, 1, 2, 5};

        System.out.println("before : src = " + Arrays.toString(src));
        
        Arrays.sort(src);
        System.out.println("after  : src = " + Arrays.toString(src));
	}
}
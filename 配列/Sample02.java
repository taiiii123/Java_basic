import java.util.Arrays;

class Sample02{
    
    public static void main(String[] args){
    
        // Arrays.fillメソッド 配列の要素をすべて埋める
        int[] x = new int[3];
        Arrays.fill(x, 10);
        System.out.println(x[0]); // 10
        System.out.println(x[1]); // 10
        System.out.println(x[2]); // 10
//        Arrays.stream(x).forEach(i -> System.out.print(i +" "));        
        System.out.println("-------------------------");
        
        // Shallow Copy と Deep Copy
        /* Shallow Copy */
        // 方法1(配列内がプリミティブ型の場合)
        int[] a = {1, 2, 3, 4, 5};
        int[] a_shallow_copy = a;
        
        System.out.println("before: Shallow Copy1");
        System.out.println("a[0] = " + a[0]); // 1
        System.out.println("a_shallow_copy[0] = " + a_shallow_copy[0]); // 1
        System.out.print("\n");

        a[0] = 10;

        System.out.println("after: Shallow Copy1");
        System.out.println("a[0] = " + a[0]); // 10 参照渡しで渡される
        System.out.println("a_shallow_copy[0] = " + a_shallow_copy[0]); // 10 参照渡しで渡される
        System.out.println("-------------------------");
        
        /* Deep Copy */
        // 方法1(配列内がプリミティブ型の場合)
        int[] b = {1, 2, 3, 4, 5};
        int[] b_deep_copy = Arrays.copyOf(b, b.length);

        System.out.println("before: Deep Copy1");
        System.out.println("b[0] = " + b[0]); // 1
        System.out.println("b_deep_copy[0] = " + b_deep_copy[0]); // 1
        System.out.print("\n");
        
        b[0] = 10;

        System.out.println("after: Deep Copy1");
        System.out.println("b[0] = " + b[0]); // 1
        System.out.println("b_deep_copy[0] = " + b_deep_copy[0]); // 1
        System.out.println("-------------------------");
        
        // 方法2(配列内がプリミティブ型の場合)
        int[] c = {1, 2, 3, 4, 5};
        int[] c_deep_copy = c.clone();

        System.out.println("before: Deep Copy2");
        System.out.println("c[0] = " + c[0]); // 1
        System.out.println("c_deep_copy[0] = " + c_deep_copy[0]); // 1
        System.out.print("\n");
        
        c[0] = 10;

        System.out.println("after: Deep Copy2");
        System.out.println("c[0] = " + c[0]); // 1
        System.out.println("c_deep_copy[0] = " + c_deep_copy[0]); // 1
        System.out.println("-------------------------");
        
    }
}

class MyTest{
  public int num;

  public MyTest(int n){
    num = n;
  }
}
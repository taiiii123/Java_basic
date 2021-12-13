/* セット(HashSet) -> 重複を許さない */
// 〇番目の要素を取得したり、追加することができない。

import java.util.*;
import java.util.HashSet;
import java.util.Set;

public class Sample02 {
    public static void main(String[] args) {
        Set<String> colors = new HashSet<String>();
        colors.add("red");
        colors.add("blue");
        colors.add("green");
        colors.add("red"); // 重複した場合、無視される。

        System.out.println(colors);
        System.out.println("size : " + colors.size());
    }
}

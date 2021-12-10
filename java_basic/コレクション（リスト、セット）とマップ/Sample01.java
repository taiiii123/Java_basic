/*
コレクション -> 配列のように複数の要素を管理できるオブジェクトが複数
コレクションには、リスト、セット、マップがある。 

リスト(List):順序通りに並べて格納
- ArrayList
- LinkedList

セット(Set):順序があるとは限らず格納(重複を許さない)
- HashSet
-LinkedHashSet
- TreeSet


マップ(Map):ペアで対応づけて格納
- HashMap
- LinkedHashMap
- TreeMap

*/

import java.util.*;

public class Sample01 {
    public static void main(String[] args) {
        // 通常の配列との違い

        // 配列の場合
        String[] array = new String[3];
        array[0] = "A";
        array[1] = "B";
        array[2] = "C";

        System.out.println(Arrays.toString(array));
    
        // ArrayListの場合
        List<String> list = new ArrayList<String>(); // <>で型を指定 ・・・ジェネリクス
        list.add("A");
        list.add("B");
        list.add("C");

        System.out.println(list);
    }
}

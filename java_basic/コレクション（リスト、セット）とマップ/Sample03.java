/* マップ(HashMap) -> キーと値のペアとして格納するデータ構造*/
// Pythonでいうところのdict(辞書)
import java.util.HashMap;
import java.util.Map;


public class Sample03 {
    public static void main(String[] args) {
        // マップを作成
        Map<String, String> map = new HashMap<String, String>();
        Map<String, Integer> map2 = new HashMap<>(); // 右のインスタンス型を省略できる

        // マップにデータを追加
        map.put("key1", "value1");
        map.put("key2", "value2");
        map.put("key3", "value3");

        map2.put("key1", 1);
        map2.put("key2", 2);
        map2.put("key3", 3);

        // マップに格納されているデータを取得
        System.out.println(map.get("key1"));
        System.out.println(map.get("key2"));
        System.out.println(map.get("key3"));

        for(String key : map2.keySet()) {
            System.out.println(key + ":" + map2.get(key));
        }

        // マップに格納されているデータを削除
        map.remove("key1");

        // マップに格納されているデータを取得
        System.out.println("----------------------------------");
        System.out.println(map.get("key1")); // null
        System.out.println(map.get("key2"));
        System.out.println(map.get("key3"));

    }
}

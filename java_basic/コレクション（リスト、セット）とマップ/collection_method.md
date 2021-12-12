## リスト(ArrayList)のメソッド

<br>

|操作| 戻り値|メソッド|機能|
|:----|:-------|:--------|:----|
|追加|boolean|add(o)|オブジェクトoをリストの末尾に追加する|
||void|add(int, o)|オブジェクトをint番号目に追加する|
||指定された位置に以前あった要素|set(int, o)|オブジェクトをint番目に置き換える|
|取得|リスト内の指定された位置にある要素|get(int)|n番目の要素を得る|
|調査|int|size()|要素の個数を返す|
||boolean|isEmpty()|空かどうか調べた上で判定|
||boolean|contains(o)|指定要素が含まれているかを判定|
||int|indexOf(o)|指定要素がな何番目にあるかを返す|
|削除|void|clear()|すべての要素を削除|
||リストから削除した要素|remove(int)|int番目の要素を削除する|
|イテレータ|Iterator|iterator()|要素を順に処理するイテレータを返す|

<br>

## セット(HashSet)のメソッド

<br>

|操作| 戻り値|メソッド|機能|
|:----|:-------|:--------|:----|
|追加|boolean|add(o)|オブジェクトoをセットに追加する|
|取得|Iterator|iterator()|イテレータを得る|
|調査|int|size()|要素の個数を返す|
||boolean|contains(o)|指定要素が含まれているかを判定|
||boolean|isEmpty()|空かどうか調べた上で判定|
|削除|boolean|remove(o)|オブジェクトoをセットから削除する|

<br>

## マップ(HashMap)のメソッド

<br>

|操作| 戻り値|メソッド|機能|
|:----|:-------|:--------|:----|
|追加|boolean|put(k, v)|キーkと値vをマップに追加する|
|取得|int|size()|要素の個数を返す|
||マップ内の指定された要素|get(int)|n番目の要素を得る|
||Iterator|keySet().iterator()|キーのイテレータを得る|
||Iterator|values().iterator()|値のイテレータを得る|
||Iterator|entrySet().iterator()|エントリのイテレータを得る|
|調査|boolean|containsKey(k)|指定キーkが含まれているかを判定|
||boolean|containsValue(v)|指定値vが含まれているかを判定|
||boolean|isEmpty()|空かどうか調べた上で判定|
|削除|void|clear()|すべての要素を削除|
||boolean|remove(k)|キーkをマップから削除する|


<br>

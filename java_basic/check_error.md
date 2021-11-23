# エラー項目
* [java.lang.NullPointerException](#anchor1)
* [java.lang.ArrayIndexOutOfBoundsException](#anchor2)
* [java.lang.NumberFormatException](#anchor3)
* [java.lang.ClassCastException](#anchor4)
* [java.lang.ArithmeticException](#anchor5)
* [java.lang.NoClassDefFoundError](#anchor6)
* [java.lang.OutOfMemoryError](#anchor7)


<a id="anchor1"><h2><font style="color: #DD0000	;"><b> java.lang.NullPointerException </b></font></h2></a>
このエラーはnullのオブジェクトに対してアクセスしようとしたときに発生する。
プログラミング時に比較的発生しやすいエラーで、エンジニアの間では「ヌルポ」と呼ばれています。

<h3><font style="color: orange;"> 対策 </font></h3>

* インスタンスの生成や値の設定が正しく行われているかをチェックする。
* オブジェクトがnullになってしまうタイミングをデバッグで確認する。
* プログラムでオブジェクトがnullかどうかのチェックを行い、エラーの発生をできる限り回避する。

<br />

<a id="anchor2"><h2><font style="color: #DD0000	;"><b> java.lang.ArrayIndexOutOfBoundsException  </b></font></h2></a>
配列のインデックスとして存在しない要素を指定した場合に発生するエラーで
先ほどのエラーの例でも紹介した。配列のインデックスとして1～9のインデックスしかないところ
10のインデックスに値を設定しようとする場合などに発生する。

<h3><font style="color: orange;"> 対策 </font></h3>

* 正しい配列のインデックスを指定できているかチェックする。
* 配列の設定を繰り返し処理で行っている場合、繰り返し回数などに問題がないかチェックする。

<br />

<a id="anchor3"><h2><font style="color: #DD0000	;"><b> java.lang.NumberFormatException  </b></font></h2></a>
このエラーは文字列の値を数値に変換(キャスト）しようとしたが
文字列に数値として正しくない値が設定されている場合に発生する。

<h3><font style="color: orange;"> 対策 </font></h3>

* 文字列にアルファベットや記号など、数値以外の文字が設定されていないかチェックする。
* 文字列に空白やnullが設定されていないかチェックする。
* 文字列には数値が設定されているが、変換しようとしている数値型で扱える値の範囲をオーバーしていないかチェックする。

<br />

<a id="anchor4"><h2><font style="color: #DD0000	;"><b> java.lang.ClassCastException  </b></font></h2></a>
このエラーはあるクラスを変換できないクラスにキャストしようとした時に発生する。

<h3><font style="color: orange;"> 対策 </font></h3>

* 配列などに設定した値のクラスと、値を取り出す時にキャストしようとしている型が一致しているかをチェックする。尚、「instanceof」で型をチェックする。
* 継承関係のある2つのクラスで、サブクラスにスーパークラスをキャストしようとしていないかをチェックする。

<br />

<a id="anchor5"><h2><font style="color: #DD0000	;"><b>java.lang.ArithmeticException  </b></font></h2></a>
このエラーは数値の計算において、不正な算術処理が行われた場合に発生する。例えば数学的にあり得ない「ゼロ除算（10÷0 など）」が発生するとこのエラーが発生する。

<h3><font style="color: orange;"> 対策 </font></h3>

* ゼロ除算が行われてないかをチェックする。
* 数値型変数で計算している場合、割る数の変数にゼロが設定されていないかチェックする

<br />

<a id="anchor6"><h2><font style="color: #DD0000	;"><b> java.lang.NoClassDefFoundError  </b></font></h2></a>
メソッドを呼び出す時や、インスタンスを生成しようとしている時に
Javaがクラス定義を読み込むことができないエラーです。

<h3><font style="color: orange;"> 対策 </font></h3>

* 環境変数CLASSPATHが誤っている可能性があるのでチェックする。
* ファイル名やパッケージ名に誤りがないかチェックする。
* プログラムに必要な外部ファイル(jar)が読み込まれているかチェックする。

<br />

<a id="anchor7"><h2><font style="color: #DD0000	;"><b> java.lang.OutOfMemoryError  </b></font></h2></a>
Javaは実行時にスタック領域とヒープ領域という2つのメモリー領域を使用するが
このエラーはプログラムの実行に必要なヒープ領域のメモリーサイズが不足した時に発生する。<br>
処理の高負荷などによってメモリ不足になるとこのエラーが発生する。

ヒープ領域とはクラスやメソッドの定義など、オブジェクトのインスタンスが割り当てられるメモリー領域のことだ。

<h3><font style="color: orange;"> 対策 </font></h3>

* プログラム内で無限ループになっていしまっている箇所がないかチェックする。
* 一度に大量のデータを処理しようとしている箇所がないかチェックする。
* 不必要にスコープ（公開範囲）が広いメソッドや変数を多用していないかチェックする。

<br />

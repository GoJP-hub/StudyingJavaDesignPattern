# FactoryMethodパターンのノート

## コンセプト
以下の特性を兼ね備えているモノ
- Mainクラスでは、Frameworkパッケージで①インスタンス作成と、②メソッド利用を行う
- Mainクラスでは、インスタンス作成で呼びだすConcreteCreator/Productを入れ替える
- Templateパターンと同様に、①基本的なメソッド、②Abstractメソッドがある

## 特性
